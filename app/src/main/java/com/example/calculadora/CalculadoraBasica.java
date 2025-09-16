package com.example.calculadora;

import android.util.Log;

public class CalculadoraBasica implements Calculadora {

    private static final String TAG = "CalculadoraLog";

    @Override
    public double sumar(double a, double b) {
        double resultado = a + b;
        mostrarResultado("Suma", resultado);
        return resultado;
    }

    @Override
    public double restar(double a, double b) {
        double resultado = a - b;
        mostrarResultado("Resta", resultado);
        return resultado;
    }

    @Override
    public double multiplicar(double a, double b) {
        double resultado = a * b;
        mostrarResultado("Multiplicación", resultado);
        return resultado;
    }

    @Override
    public double dividir(double a, double b) {
        double resultado = (b != 0) ? a / b : Double.NaN;
        mostrarResultado("División", resultado);
        return resultado;
    }

    private void mostrarResultado(String operacion, double resultado) {
        if (Double.isNaN(resultado)) {
            Log.d(TAG, operacion + ": Error - Resultado es NaN");
        } else {
            Log.d(TAG, operacion + ": " + resultado);
        }
    }
}

