package com.planodeestudos.fundamentos.primeiromes.poo.contabancaria.entity;

public class Titular {

    // Atributos
    private Long id;
    private String nome;
    private String bilheteDeIdentidade;

    private static Long contadorId = 0L;

    // Construtor vazio
    public Titular() {
    }

    // Construtor com parâmetros
    public Titular(String nome, String bilheteDeIdentidade) {
        this.id = contadorId++;
        this.nome = nome;
        this.bilheteDeIdentidade = bilheteDeIdentidade;
    }


    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBilheteDeIdentidade() {
        return bilheteDeIdentidade;
    }

    public void setBilheteDeIdentidade(String bilheteDeIdentidade) {
        this.bilheteDeIdentidade = bilheteDeIdentidade;
    }

    // toString
    @Override
    public String toString() {
        return "{   \n"+
                    "id=" + id + ",\n" + 
                    "nome=" + nome +  ",\n" + 
                    "bilheteDeIdentidade=" + bilheteDeIdentidade + 
                    "\n"+
                    "}";
    }

    
}
