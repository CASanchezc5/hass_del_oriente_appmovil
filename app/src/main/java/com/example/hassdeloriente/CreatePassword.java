package com.example.hassdeloriente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CreatePassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_password);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //Metodo para el boton registrarse (este solo va a cambiar de activity)
    public void registrarse(View view){
        Intent registrarse = new Intent(this, profile.class);
        startActivity(registrarse);
    }

    //Metodo para el boton iniciar sesion
    public void IniciarSesion (View view){
        Intent inicioSesion = new Intent(this, Login.class);
        startActivity(inicioSesion);
    }
}