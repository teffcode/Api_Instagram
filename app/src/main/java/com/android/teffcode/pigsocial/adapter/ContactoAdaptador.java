package com.android.teffcode.pigsocial.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.teffcode.pigsocial.R;
import com.android.teffcode.pigsocial.pojo.Contacto;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by user on 10/05/17.
 */

public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.ContactoViewHolder>{

    ArrayList<Contacto> contactos;
    Activity activity;

    public ContactoAdaptador(ArrayList<Contacto> contactos, Activity activity) {
        this.contactos = contactos;
        this.activity = activity;
    }

    @Override
    public ContactoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil, parent, false);
        return new ContactoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ContactoViewHolder contactoViewHolder, int position) {
        final Contacto contacto = contactos.get(position);
        Picasso.with(activity)
                .load(contacto.getUrlFoto())
                .placeholder(R.drawable.button_like)
                .into(contactoViewHolder.imgFoto);
        contactoViewHolder.tvLikes.setText(String.valueOf(contacto.getLikes()));
    }

    @Override
    public int getItemCount() {return contactos.size(); }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView tvLikes;

        public ContactoViewHolder(View itemView) {
            super(itemView);

            imgFoto     = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvLikes     = (TextView) itemView.findViewById(R.id.txtLikes);

        }
    }
}
