package com.example.banco;

public class Cuenta {
    private String titular;
    private Double cantidad;

    public Cuenta() {
        titular = "Pedro Perez";
        cantidad = 45500.5;
    }

    public String mostrar_saldo(){  //GET
       return "Titular "+ titular+" saldo: "+cantidad;
    }

    public String toString (){    //tostring no funciona*****
        return "Titular "+ titular+" saldo: "+cantidad;


    }
}
