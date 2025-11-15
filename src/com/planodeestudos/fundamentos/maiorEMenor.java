package com.planodeestudos.fundamentos;

import java.util.Scanner;

public class maiorEMenor {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

// Array de números
        double numeros[] = {65.5,23,87,4,3,0,-10,34,-5};

        double maior = numeros[0];
        double menor = numeros[0];

        // Laço para encontrar maior e menor número

        for(int i = 0; i < numeros.length; i++){

            // Comparações para encontrar maior e menor número
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
