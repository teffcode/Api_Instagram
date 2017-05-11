package com.android.teffcode.pigsocial.vista.fragment;

import com.android.teffcode.pigsocial.adapter.ContactoAdaptador;
import com.android.teffcode.pigsocial.pojo.Contacto;

import java.util.ArrayList;

/**
 * Created by user on 11/05/17.
 */

public interface IRecyclerViewFragment {
    public void generarLinearLayoutVertical();
    public void generarGridLayout();

    public ContactoAdaptador crearAdaptador(ArrayList<Contacto> contactos);

    public void inicializarAdaptadorRV(ContactoAdaptador adaptador);
}
