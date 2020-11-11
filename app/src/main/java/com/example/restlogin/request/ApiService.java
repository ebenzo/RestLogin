package com.example.restlogin.request;

import com.example.restlogin.model.LoginView;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public class ApiService {

    public interface MyApiInterface{

        @POST("login")
        Call<LoginView> leer(@Query("Usuario")String Correo, @Query("Clave")String Clave);
    }
}
