package com.example.banco;

public class Cuenta {
    private String titular;
    private Double cantidad;

    public Cuenta() {
        titular = "Pedro Perez";
        cantidad = 45500.5;
    }

    public String muestra_datos(){  //GET
       return "El titular es "+ titular+" y el saldo es: "+cantidad;
    }

    public void modifica_saldo(Double cantidad){  //SET
        this.cantidad = cantidad;
    }
    public String muestra_saldo(){
        return "El nuevo saldo es "+cantidad;

    }
}
