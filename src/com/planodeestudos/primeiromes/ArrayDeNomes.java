package com.planodeestudos.primeiromes;

import java.io.Console;

public class ArrayDeNomes {

    static Console console = System.console();
    public static void main(String[] args) {
        // String [] nomes = {"Andersio Lopes", "Hipolito Manuel", "Manuel Kalueka", "Daniel Gomes"};

        // for (int indice = 0; indice < nomes.length; indice++) {
        //     System.out.println("O nome no índice " + indice + " é: " + nomes[indice]);            
        // }

        System.out.println("-----------------------------------");
        System.out.println("Digite o numero de nomes que deseja inserir:");
        int numeroDeNomes = Integer.parseInt(console.readLine());

        for (int indice = 0; indice < numeroDeNomes; indice++) {
            System.out.println("Digite o nome no índice " + indice + ":");
            String nome = console.readLine();
            System.out.println("O nome no índice " + indice + " é: " + nome);  
        }

        String[] nomes = new String[numeroDeNomes];

        for (String string : nomes) {
            System.out.println(string);
        }

    }
}
