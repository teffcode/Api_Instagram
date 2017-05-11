package com.android.teffcode.pigsocial.restApi;

import retrofit2.Call;
import retrofit2.http.GET;

import com.android.teffcode.pigsocial.restApi.model.ContactoResponse;

/**
 * Created by user on 11/05/17.
 */

public interface EndpointsApi {

    // métodos que generan peticiones para retrofit

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER) // obtener del server
    Call<ContactoResponse> getRecentMedia();

}
