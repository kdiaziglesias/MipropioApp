package com.example.kdiaziglesias.mipropioapp;

import java.io.Serializable;

/**
 * Created by kdiaziglesias on 21/11/14.
 */



public class Contacto implements Serializable{

    private String nombre;
    private String telefono;


    public Contacto () {


    }

    public Contacto(String nombre,String telefono){

        this.setNombre(nombre);
        this.setTelefono(telefono);


    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String toString(){
        return  this.nombre+" "+this.telefono;
    }
}
