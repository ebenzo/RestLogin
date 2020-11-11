package com.example.restlogin.request;

import android.util.Log;

import com.example.restlogin.model.LoginView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public class ApiClient {

    private static final String PATH="http://localhost:50559/api/propietarios/";//"https://192.168.1.129:45455/Api/Propietarios/";
    private static MyApiInterface myApiInterface;

    public static MyApiInterface getMyApiClient()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PATH)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Log.d("Mensaje",retrofit.baseUrl().toString());
        myApiInterface=retrofit.create(MyApiInterface.class);
        return myApiInterface;
    }

    public interface MyApiInterface{

        @POST("login")
        Call<String> leer(@Query("Usuario")String Correo, @Query("Clave")String Clave);
    }
}
