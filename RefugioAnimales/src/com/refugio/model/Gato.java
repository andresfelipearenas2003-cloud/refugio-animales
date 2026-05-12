package com.refugio.model;

import com.refugio.interfaces.Adoptable;
import com.refugio.interfaces.Vacunable;

import java.util.ArrayList;

public class Gato extends Animal implements Adoptable, Vacunable {

    private String color;

    private ArrayList<String> vacunas = new ArrayList<>();

    public Gato(String nombre, int edad, String color) {

        super(nombre, edad);

        this.color = color;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("===== GATO =====");

        System.out.println("Nombre: " + nombre);

        System.out.println("Edad: " + edad);

        System.out.println("Color: " + color);
    }

    @Override
    public void adoptar() {

        System.out.println(nombre + " fue adoptado.");
    }

    @Override
    public void devolver() {

        System.out.println(nombre + " fue devuelto.");
    }

    @Override
    public void vacunar(String vacuna) {

        vacunas.add(vacuna);

        System.out.println(nombre + " recibió vacuna: " + vacuna);
    }

    @Override
    public void mostrarVacunas() {

        System.out.println("Vacunas de " + nombre);

        for (String vacuna : vacunas) {

            System.out.println("- " + vacuna);
        }
    }
}
