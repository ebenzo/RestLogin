package com.example.restlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.restlogin.request.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private String token;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buscarVM();

        Button btnLogin = findViewById(R.id.btnLogin);
        TextView token;
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarVM();
            }
        });
    }

    public void buscarVM(){
        /*Call<String> datos = ApiClient.getMyApiClient().leer("propietario@leo.com", "1234");*/
        Call<String> datos = ApiClient.getMyApiClient().leer("ebenzo@gmail.com", "123456");

        datos.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if(response.isSuccessful())
                {
                    token = response.body();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d("ID:",t.getMessage());
            }
        });
    }
}
