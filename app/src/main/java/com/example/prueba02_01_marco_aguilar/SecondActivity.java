package com.example.prueba02_01_marco_aguilar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    EditText etNombres, etApellidos, etDividendo, etDivisor, etNumero;

    TextView tvNombres, tvApellidos, tvDividendo, tvDivisor, tvNumero;
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


        tvNombres = findViewById(R.id.etNombres2);
        tvApellidos = findViewById(R.id.etApellidos2);
        tvDividendo = findViewById(R.id.etDividendo2);
        tvDivisor = findViewById(R.id.etDivisor2);
        tvNumero = findViewById(R.id.etNumero2);



        Intent i = getIntent();
        String nombres = i.getStringExtra("nombres");
        String apellidos = i.getStringExtra("apellidos");
        String dividendo = i.getStringExtra("dividendo");
        String divisor = i.getStringExtra("divisor");
        String numero2 = i.getStringExtra("numInvertido");

        tvNombres.setText(nombres);
        tvApellidos.setText(apellidos);
        tvDividendo.setText(dividendo);
        tvDivisor.setText(divisor);
        tvNumero.setText(numero2);




        btnSiguiente.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            intent.putExtra("nombres", etNombres.getText().toString());
            intent.putExtra("apellidos", etApellidos.getText().toString());
            startActivity(intent);
        });



        btnCerrar.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            intent.putExtra("nombres", etNombres.getText().toString());
            intent.putExtra("apellidos", etApellidos.getText().toString());
            intent.putExtra("dividendo", etDividendo.getText().toString());
            intent.putExtra("divisor", etDivisor.getText().toString());
            intent.putExtra("numInvertido", etNumero.getText().toString());
            startActivity(intent);
        });
    }
}