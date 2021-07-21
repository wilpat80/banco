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
        public void modificar_saldo(View view){
            Cuenta usuario = new Cuenta();
            usuario.modifica_saldo(25000.5);
            txtresultado.setText(usuario.muestra_saldo());
        }
        public void mostrar_saldo (View view) {
            Cuenta usuario = new Cuenta();
            txtresultado.setText(usuario.muestra_saldo());
        }
}