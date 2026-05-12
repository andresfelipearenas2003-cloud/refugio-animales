package com.refugio.service;

import com.refugio.model.Animal;

import java.util.ArrayList;

public class GestorCatalogo {

    private ArrayList<Animal> animales = new ArrayList<>();

    public void agregarAnimal(Animal animal) {

        animales.add(animal);

        System.out.println("Animal agregado al catálogo.");
    }

    public void mostrarCatalogo() {

        System.out.println("\n===== CATÁLOGO DE ANIMALES =====");

        for (Animal animal : animales) {

            // POLIMORFISMO
            animal.mostrarInformacion();

            System.out.println("---------------------------");
        }
    }
}