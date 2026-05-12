package com.refugio.model;
import com.refugio.interfaces.Adoptable;
import com.refugio.interfaces.Vacunable;

import java.util.ArrayList;
public class Perro extends Animal implements Adoptable, Vacunable {

    private String raza;

    private ArrayList<String> vacunas = new ArrayList<>();

    public Perro(String nombre, int edad, String raza) {

        super(nombre, edad);

        this.raza = raza;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("===== PERRO =====");

        System.out.println("Nombre: " + nombre);

        System.out.println("Edad: " + edad);

        System.out.println("Raza: " + raza);
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
