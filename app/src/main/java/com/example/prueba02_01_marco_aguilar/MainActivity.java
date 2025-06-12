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

        btnMostrar.setOnClickListener(v -> {
            try {
                int dividendo = Integer.parseInt(etDividendo.getText().toString());
                int divisor = Integer.parseInt(etDivisor.getText().toString());
                int numInvertido = Integer.parseInt(etNumInvertido.getText().toString());

                if (divisor == 0) {
                    Toast.makeText(this, "El divisor no puede ser 0", Toast.LENGTH_SHORT).show();
                    return;
                }

                int cociente = 0;
                int acumulador = divisor;

                if (dividendo >= divisor) {
                    do {
                        cociente++;
                        acumulador += divisor;
                    } while (acumulador <= dividendo);
                }

                int residuo = dividendo - (cociente * divisor);

                etParteEntera.setText(String.valueOf(cociente));
                etResiduo.setText(String.valueOf(residuo));

                //Numero invertido con vectores
                int numero = numInvertido;
                int[] digitos = new int[10];
                int i = 0;

                do {
                    digitos[i] = numero % 10;
                    numero /= 10;
                    i++;
                } while (numero > 0);

                StringBuilder invertido = new StringBuilder();
                for (int j = 0; j < i; j++) {
                    invertido.append(digitos[j]);
                }

                etNumInvertido.setText(invertido.toString());

            } catch (Exception e) {
                Toast.makeText(this, "Datos inválidos", Toast.LENGTH_SHORT).show();
            }
        });



        // Recibir datos del layout 2
        Intent i = getIntent();
        if (i.hasExtra("nombres")) {
            etNombres.setText(i.getStringExtra("nombres"));
            etApellidos.setText(i.getStringExtra("apellidos"));
            etDividendo.setText(i.getStringExtra("dividendo"));
            etDivisor.setText(i.getStringExtra("divisor"));
            etNumInvertido.setText(i.getStringExtra("numInvertido"));

            // Desbloquear campos
            habilitarCampos(true);
        }
    }

    private void habilitarCampos(boolean enabled) {
        etNombres.setEnabled(enabled);
        etApellidos.setEnabled(enabled);
        etDividendo.setEnabled(enabled);
        etDivisor.setEnabled(enabled);
    }






}
