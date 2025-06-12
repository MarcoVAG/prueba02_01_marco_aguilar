package com.example.prueba02_01_marco_aguilar;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    TextView tvNombres, tvApellidos;
    EditText etDividendo, etDivisor, etNumero;
    Button btnCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3_mvag);

        tvNombres = findViewById(R.id.etNombres3);
        tvApellidos = findViewById(R.id.etApellidos3);
        etDividendo = findViewById(R.id.etDividendo3);
        etDivisor = findViewById(R.id.etDivisor3);
        etNumero = findViewById(R.id.etNumero3);
        btnCerrar = findViewById(R.id.btnCerrar3);

        Intent i = getIntent();
        String nombres = i.getStringExtra("nombres");
        String apellidos = i.getStringExtra("apellidos");

        tvNombres.setText(nombres);
        tvApellidos.setText(apellidos);

        btnCerrar.setOnClickListener(v -> {
            Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
            intent.putExtra("nombres", nombres);
            intent.putExtra("apellidos", apellidos);
            intent.putExtra("dividendo", etDividendo.getText().toString());
            intent.putExtra("divisor", etDivisor.getText().toString());
            intent.putExtra("numInvertido", etNumero.getText().toString());
            startActivity(intent);
        });
    }



}


