package com.example.banco;

public class Cuenta {
    private String titular;
    private Double cantidad;

    public Cuenta() {
        titular = "Pedro Perez";
        cantidad = 45500.5;
    }

    public String muestra_saldo(){  //GET
       return "Titular "+ titular+" saldo: "+cantidad;
    }

    public void modifica_saldo(Double cantidad){  //SET
        this.cantidad = cantidad;

    }
}
