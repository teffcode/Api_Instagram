package com.android.teffcode.pigsocial.restApi.model;

import com.android.teffcode.pigsocial.pojo.Contacto;

import java.util.ArrayList;

/**
 * Created by user on 11/05/17.
 */

public class ContactoResponse {

    // la respuesta será un array de contactos
    ArrayList<Contacto> contactos;

    // setter y getters
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }
}

