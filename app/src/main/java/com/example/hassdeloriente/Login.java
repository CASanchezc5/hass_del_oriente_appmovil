package com.example.hassdeloriente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

    }

    //Metodo para el boton ingresar
    public void ingresar(View view){
        Intent ingresar = new Intent(this, profile.class);
        startActivity(ingresar);
    }
    //Metodo para el boton registrarse
    public  void registrarse (View view){
        Intent registrar = new Intent(this, checkin.class);
        startActivity(registrar);
    }
}