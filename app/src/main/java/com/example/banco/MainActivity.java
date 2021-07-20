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

    txtresultado.setText(usuario1.mostrar_saldo());

  //  Toast.makeText(this, usuario1, Toast.LENGTH_SHORT).show();
    
    //Toast.makeText(this, "El saldo es: "+ usuario1.cantidad, Toast.LENGTH_LONG).show();

}

}