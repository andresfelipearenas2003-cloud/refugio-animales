package com.refugio.model;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void mostrarInformacion();

    public String getNombre() {

        return nombre;
    }
}
