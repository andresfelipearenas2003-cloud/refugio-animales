package com.refugio.main;

import com.refugio.model.*;
import com.refugio.service.*;

public class Main {

    public static void main(String[] args) {

        GestorCatalogo catalogo =
                new GestorCatalogo();

        EmailNotificacion email =
                new EmailNotificacion();

        GestorAdopciones adopciones =
                new GestorAdopciones(email);

        Perro perro1 =
                new Perro("Max", 3, "Labrador");

        Gato gato1 =
                new Gato("Michi", 2, "Blanco");

        catalogo.agregarAnimal(perro1);

        catalogo.agregarAnimal(gato1);

        catalogo.mostrarCatalogo();

        perro1.vacunar("Rabia");

        perro1.mostrarVacunas();

        adopciones.realizarAdopcion(perro1);
    }
}