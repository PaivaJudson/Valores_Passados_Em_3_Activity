package com.example.valores_passados_em_3_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela2 extends AppCompatActivity {

    Button btn_valor2;
    EditText edt_valor2;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        edt_valor2 = findViewById(R.id.edt_valor2);
        btn_valor2 = findViewById(R.id.btn_valor2);
        i = getIntent();

        btn_valor2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String valor1 = i.getExtras().getString("valor1");
                i = new Intent(Tela2.this, Tela3.class);
                i.putExtra("valor1", valor1);
                i.putExtra("valor2", edt_valor2.getText().toString());
                startActivity(i);
            }
        });
    }
}