package com.example.kdiaziglesias.mipropioapp;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kdiaziglesias.mipropioapp.R;

import java.util.ArrayList;

public class ListaAgenda extends ListActivity {

     ArrayList<Contacto> lista = new ArrayList<Contacto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_agenda);
        Intent intento = getIntent();

        lista=(ArrayList<Contacto>)intento.getSerializableExtra("Lista");
        setListAdapter(new ArrayAdapter<Contacto>(this,android.R.layout.simple_list_item_1,lista));


    }

    protected void onListItemClick(ListView parent, View v, int position, long id) {
        Toast.makeText(this, "Hola Sr/Sra "+lista.get(position),Toast.LENGTH_SHORT).show();
        Intent intento = new Intent(ListaAgenda.this,SegunadActividad.class);
        intento.putExtra("Lista",lista);
        startActivityForResult(intento,1);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.lista_agenda, menu);
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
