package com.android.teffcode.pigsocial.restApi.adapter;

import com.android.teffcode.pigsocial.restApi.ConstantesRestApi;
import com.android.teffcode.pigsocial.restApi.EndpointsApi;
import com.android.teffcode.pigsocial.restApi.deserializador.ContactoDeserializador;
import com.android.teffcode.pigsocial.restApi.model.ContactoResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 11/05/17.
 */

public class RestApiAdapter {

    public EndpointsApi establecerConexionRestApiInstagram(Gson gson){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL) // recibe url base a la que nos conectamos
                .addConverterFactory(GsonConverterFactory.create(gson)) // deserealización de los datos - osea, traer datos
                .build();

        return retrofit.create(EndpointsApi.class);
    }

    public Gson construyeGsonDeserializadorMediaRecent(){
        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.registerTypeAdapter(ContactoResponse.class, new ContactoDeserializador());
        return gsonBuilder.create();
    }

}
