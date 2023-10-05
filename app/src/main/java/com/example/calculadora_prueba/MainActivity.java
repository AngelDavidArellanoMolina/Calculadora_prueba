package com.example.calculadora_prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText result = findViewById(R.id.result);
        EditText numArriba = findViewById(R.id.numArriba);
        Button ac = findViewById(R.id.ac);
        Button masmenos = findViewById(R.id.masmenos);
        Button porcentaje = findViewById(R.id.porcentaje);
        Button division = findViewById(R.id.division);
        Button multiplicacion = findViewById(R.id.multiplicacion);
        Button mas = findViewById(R.id.mas);
        Button menos = findViewById(R.id.menos);
        Button igual = findViewById(R.id.igual);
        Button coma = findViewById(R.id.coma);
        Button uno = findViewById(R.id.uno);
        Button dos = findViewById(R.id.dos);
        Button tres = findViewById(R.id.tres);
        Button cuatro = findViewById(R.id.cuatro);
        Button cinco = findViewById(R.id.cinco);
        Button seis = findViewById(R.id.seis);
        Button siete = findViewById(R.id.siete);
        Button ocho = findViewById(R.id.ocho);
        Button nueve = findViewById(R.id.nueve);
        Button cero = findViewById(R.id.cero);
        final int[] primerNumero = new int[1];
        final int[] segundoNumero = new int[1];
        final String[] operacion = new String[1];


        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", cero.getText().toString());
                result.setText(result.getText().toString() + "0");
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", uno.getText().toString());
                result.setText(result.getText().toString() + "1");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", dos.getText().toString());
                result.setText(result.getText().toString() + "2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", tres.getText().toString());
                result.setText(result.getText().toString() + "3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", cuatro.getText().toString());
                result.setText(result.getText().toString() + "4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", cinco.getText().toString());
                result.setText(result.getText().toString() + "5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", seis.getText().toString());
                result.setText(result.getText().toString() + "6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", siete.getText().toString());
                result.setText(result.getText().toString() + "7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", ocho.getText().toString());
                result.setText(result.getText().toString() + "8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", nueve.getText().toString());
                result.setText(result.getText().toString() + "9");
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", ac.getText().toString());
                result.setText("");
            }
        });
        masmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", masmenos.getText().toString());

                if (result.getText().toString().contains("-")) {
                    result.setText(result.getText().toString().replace("-", ""));
                } else {
                    result.setText("-" + result.getText().toString());
                }
            }
        });
        porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", porcentaje.getText().toString());
                result.setText("No hay nada bellaco");
            }
        });
        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", mas.getText().toString());
                primerNumero[0] = Integer.parseInt(result.getText().toString());
                numArriba.setText(String.valueOf(primerNumero[0]));
                operacion[0] = "+";
                result.setText("");
            }
        });
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", menos.getText().toString());
                primerNumero[0] = Integer.parseInt(result.getText().toString());
                numArriba.setText(String.valueOf(primerNumero[0]));
                operacion[0] = "-";
                result.setText("");
            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", multiplicacion.getText().toString());
                primerNumero[0] = Integer.parseInt(result.getText().toString());
                numArriba.setText(String.valueOf(primerNumero[0]));
                operacion[0] = "x";
                result.setText("");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", division.getText().toString());
                primerNumero[0] = Integer.parseInt(result.getText().toString());
                numArriba.setText(String.valueOf(primerNumero[0]));
                operacion[0] = "/";
                result.setText("");
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Botón pulsado: ", igual.getText().toString());
                segundoNumero[0] = Integer.parseInt(result.getText().toString());
                switch (operacion[0]) {
                    case "+":
                        result.setText(String.valueOf(segundoNumero[0] + primerNumero[0]));
                        break;
                    case "-":
                        result.setText(String.valueOf(segundoNumero[0] - primerNumero[0]));
                        break;
                    case "x":
                        result.setText(String.valueOf(segundoNumero[0] * primerNumero[0]));
                        break;
                    case "/":
                        result.setText(String.valueOf(primerNumero[0] / segundoNumero[0]));
                        break;
                    default:
                        result.setText("Error");
                        break;
                }
                numArriba.setText("");
            }
        });
    }
}