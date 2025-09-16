package com.example.calculadora;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Crear instancia de la calculadora
        Calculadora calc = new CalculadoraBasica();

        // Variables de prueba
        double a = 10.0;
        double b = 5.0;
        double c = 0.0;

        // Operaciones
        calc.sumar(a, b);
        calc.restar(a, b);
        calc.multiplicar(a, b);
        calc.dividir(a, b);
        calc.dividir(a, c); // División por cero (NaN)
    }
}

