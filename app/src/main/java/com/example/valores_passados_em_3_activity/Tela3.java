package com.example.valores_passados_em_3_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tela3 extends AppCompatActivity {

    TextView txtResultado;
    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        i = getIntent();
        txtResultado = findViewById(R.id.txtResultado);
        int valor1 = Integer.parseInt(i.getExtras().getString("valor1"));
        int valor2 = Integer.parseInt(i.getExtras().getString("valor2"));

        String result = valor1 + " + "+ valor2 +" = "+ (valor1 + valor2) + "\n"
                      + valor1 + " - "+ valor2 +" = "+ (valor1 - valor2) + "\n"
                      + valor1 + " * "+ valor2 +" = "+ (valor1 * valor2) + "\n"
                      + valor1 + " / "+ valor2 +" = "+ (valor1 / valor2) + "\n";

        txtResultado.setText(result);

    }
}