package com.example.banco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtresultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtresultado = findViewById(R.id.textView);

        }

public void mostrar1 (View view) {
    Cuenta usuario1 = new Cuenta();
    txtresultado.setText("Titular "+ usuario1.titular+" saldo: "+usuario1.cantidad);
  //  Toast.makeText(this, "Titular" + usuario1.titular+" y el saldo es "+usuario1.cantidad, Toast.LENGTH_LONG).show();
    //Toast.makeText(this, "El saldo es: "+ usuario1.cantidad, Toast.LENGTH_LONG).show();

}

}