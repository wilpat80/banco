package com.example.banco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        }

public void mostrar1 (View view) {
    Cuenta usuario1 = new Cuenta();
    Toast.makeText(this, "Prueba1", Toast.LENGTH_SHORT).show();
    Toast.makeText(this, "Titular" + usuario1.titular, Toast.LENGTH_SHORT).show();
}

}