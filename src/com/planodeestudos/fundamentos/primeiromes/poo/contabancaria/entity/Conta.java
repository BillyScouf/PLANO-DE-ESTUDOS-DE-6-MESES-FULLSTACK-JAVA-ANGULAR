package com.planodeestudos.fundamentos.primeiromes.poo.contabancaria.entity;

public class Conta {
    
    private Long id;
    private int  numeroConta;
    private double saldo;

    private static Long contadorId = 0L;

    // Construtor vazio
    public Conta() {
    }

    public Conta(int numeroConta, double saldo) {
        this.id = contadorId++;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    // toString
    @Override
    public String toString() {
        return "{   \n"+
                    "id=" + id + ",\n" + 
                    "numeroConta=" + numeroConta +  ",\n" + 
                    "saldo=" + saldo + 
                    "\n"+
                    "}";
    }

    
    
    
}
