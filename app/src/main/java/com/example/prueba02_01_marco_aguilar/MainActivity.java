package com.example.prueba02_01_marco_aguilar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etNombres, etApellidos, etDividendo, etDivisor, etParteEntera, etResiduo, etNumInvertido;
    Button btnSiguiente, btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombres = findViewById(R.id.etNombres);
        etApellidos = findViewById(R.id.etApellidos);
        etDividendo = findViewById(R.id.etDividendo);
        etDivisor = findViewById(R.id.etDivisor);
        etParteEntera = findViewById(R.id.etParteEntera);
        etResiduo = findViewById(R.id.etResiduo);
        etNumInvertido = findViewById(R.id.etNumInvertido);

        btnSiguiente = findViewById(R.id.btnSiguiente1);
        btnMostrar = findViewById(R.id.btnMostrarResultados);

        btnSiguiente.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });







}
