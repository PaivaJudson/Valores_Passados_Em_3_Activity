package com.example.valores_passados_em_3_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt_valor1;
    Button btn_valor1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_valor1 = findViewById(R.id.edt_valor1);
        btn_valor1 = findViewById(R.id.btn_valor1);

        btn_valor1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tela2.class);
                intent.putExtra("valor1", edt_valor1.getText().toString());
            }
        });
    }
}