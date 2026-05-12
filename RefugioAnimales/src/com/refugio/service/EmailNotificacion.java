package com.refugio.service;

import com.refugio.interfaces.Notificable;

public class EmailNotificacion implements Notificable {

    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {

        System.out.println("Notificación enviada a: " + destinatario);

        System.out.println("Mensaje: " + mensaje);
    }
}
