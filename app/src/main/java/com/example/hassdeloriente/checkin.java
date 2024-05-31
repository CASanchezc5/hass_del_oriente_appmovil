package com.example.hassdeloriente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class checkin extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_checkin);

        spinner = findViewById(R.id.spinner_tpUsuario);

        String [] opciones = {"Persona natural", "Persona juridica"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_desplegable, opciones);
        spinner.setAdapter(adapter);
    }

    //Metodo para el boton siguiente
    public void siguiente(View view){
        Intent siguiente = new Intent(this, checkin1.class);
        startActivity(siguiente);
    }


}