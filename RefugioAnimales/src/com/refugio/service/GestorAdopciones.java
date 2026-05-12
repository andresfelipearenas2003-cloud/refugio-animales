package com.refugio.service;

import com.refugio.interfaces.Adoptable;
import com.refugio.interfaces.Notificable;

public class GestorAdopciones {

    private Notificable notificacion;

    public GestorAdopciones(Notificable notificacion) {

        this.notificacion = notificacion;
    }

    public void realizarAdopcion(Adoptable adoptable) {

        adoptable.adoptar();

        notificacion.enviarNotificacion(
                "Usuario",
                "Adopción realizada correctamente"
        );
    }
}