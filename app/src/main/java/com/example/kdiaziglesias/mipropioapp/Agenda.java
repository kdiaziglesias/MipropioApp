package com.example.kdiaziglesias.mipropioapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Agenda extends Activity {

    Contacto conn;
    ArrayList<Contacto> lista = new ArrayList<Contacto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        Button bta = (Button) findViewById(R.id.bañadir);
        Button bte = (Button) findViewById(R.id.blista);





        bta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText texto = (EditText) findViewById(R.id.pnombre);
                EditText texto2 = (EditText) findViewById(R.id.ptelefono);
                TextView text = (TextView) findViewById(R.id.textoañadir);

                if ("".equals(texto.getText().toString())) {

                    String msg = getResources().getString(R.string.añadir);

                    showToast("Te falta el nombre ");

                    return;
                }


                if ("".equals(texto2.getText().toString())) {

                    String msg = getResources().getString(R.string.añadir);

                    showToast("Te falta el telefono ");

                    return;
                }

                String enterName = texto.getText().toString();
                String ponerTelefono = texto2.getText().toString();

                //String saludo = getResources().getString(R.string.añadir)+enterName+","+ponerTelefono;


                text.setText(enterName + " " + ponerTelefono);

                conn = new Contacto(enterName,ponerTelefono);
                lista.add(conn);



            }

        });

       bte.setOnClickListener(new View.OnClickListener() {


           @Override
           public void onClick(View v) {

            EditText texto3 = (EditText) findViewById(R.id.pnombre2);
            String coger = texto3.getText().toString();
            String salutation="";


               salutation = getResources().getString(R.string.editar)+" "+salutation+" "+ coger;
               texto3.setText(salutation);

               Intent intento = new Intent(Agenda.this,ListaAgenda.class);
               intento.putExtra("Lista",lista);
               startActivityForResult(intento,1);
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
        getMenuInflater().inflate(R.menu.agenda, menu);
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
