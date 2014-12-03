package com.example.kdiaziglesias.mipropioapp;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kdiaziglesias.mipropioapp.R;

public class SegunadActividad extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunad_actividad);
        String nombre= getIntent().getExtras().getString("Nombre");
        String telefono = getIntent().getExtras().getString("Telefono");

        EditText out = (EditText)findViewById(R.id.pnombre3);
        EditText out2 = (EditText)findViewById(R.id.ptelefono2);


        Button botonok = (Button)findViewById(R.id.bok);


        botonok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText text = (EditText) findViewById(R.id.pnombre3);
                EditText text2 = (EditText) findViewById(R.id.ptelefono2);
                EditText dentro =(EditText) findViewById(R.id.pnombre2);






                if ("".equals(text.getText().toString())) {

                    String msg = getResources().getString(R.string.ok);

                    showToast("Te falta el nombre ");

                    return;
                }


                if ("".equals(text2.getText().toString())) {

                    String msg = getResources().getString(R.string.ok);

                    showToast("Te falta el telefono ");

                    return;
                }

                String enterName = text.getText().toString();
                String ponerTelefono = text2.getText().toString();




            }
        });




    }
    public void showToast(String msg){

        Context contexto = getApplicationContext();
        int duracion = Toast.LENGTH_SHORT;
        Toast tostada = Toast.makeText(contexto,msg,duracion);
        tostada.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.segunad_actividad, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
