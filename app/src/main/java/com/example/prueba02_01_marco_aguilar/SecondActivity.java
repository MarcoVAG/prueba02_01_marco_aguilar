package com.example.prueba02_01_marco_aguilar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    EditText etNombres, etApellidos, etDividendo, etDivisor, etNumero;
    Button btnSiguiente, btnCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2_mvag);

        etNombres = findViewById(R.id.etNombres2);
        etApellidos = findViewById(R.id.etApellidos2);
        etDividendo = findViewById(R.id.etDividendo2);
        etDivisor = findViewById(R.id.etDivisor2);
        etNumero = findViewById(R.id.etNumero2);

        btnSiguiente = findViewById(R.id.btnSiguiente2);
        btnCerrar = findViewById(R.id.btnCerrar2);


    }
}