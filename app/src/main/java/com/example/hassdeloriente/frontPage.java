package com.example.hassdeloriente;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class frontPage  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontpage_main);

        // Usamos un Handler para posponer la ejecución del código
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crea un Intent para iniciar la actividad Login
                Intent intent = new Intent(frontPage.this, Login.class);
                startActivity(intent);
                finish();  // Finaliza la actividad actual para que el usuario no pueda volver a ella
            }
        }, 2000); // 2000 milisegundos = 2 segundos
    }
}
