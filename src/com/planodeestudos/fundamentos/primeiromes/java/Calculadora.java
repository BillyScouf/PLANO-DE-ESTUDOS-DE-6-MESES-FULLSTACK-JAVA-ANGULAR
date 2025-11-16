package com.planodeestudos.fundamentos.primeiromes.java;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculadora {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        try {
            startSystem();
        } catch(NoSuchElementException e){
            System.out.println("Entrada inválida. Encerrando o sistema.");
            return;
        }

        input.close();
    }

    static public void startSystem() {
        do { 
            System.out.println("Calculadora Iniciada!");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Somar");
            System.out.println("2 - Dividir");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Subtrair");
            System.out.println("0 - Sair do sistema");

            int option = input.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Opção de soma escolhida com sucesso!");
                    sumNumbers();
                }
                case 2 -> {
                    System.out.println("Opção de divisão escolhida com sucesso!");
                    divideNumbers();
                }
                case 3 -> {
                    System.out.println("Opção de multiplicação escolhida com sucesso!");
                    multiplyNumbers();
                }
                case 4 -> {
                    System.out.println("Opção de subtração escolhida com sucesso!");
                    subtractNumbers();
                }
                case 0 -> {
                    System.out.println("Saindo do sistema...");
                    exitSystem();
                }
                default ->{
                    System.out.println("Opção inválida");
                    System.out.println("Tente novamente");
                }
            }

        } while (true);
    }

    static public void sumNumbers(){
        System.out.println("Digite o primeiro número:");
        double firstNumber = input.nextDouble();

        System.out.println("Digite o segundo número:");
        double secondNumber = input.nextDouble();

        double result = firstNumber + secondNumber;

        System.out.println("O resultado da soma é: " + result);
    }

    static public void divideNumbers(){
        System.out.println("Digite o primeiro número:");
        double firstNumber = input.nextDouble();

        System.out.println("Digite o segundo número:");
        double secondNumber = input.nextDouble();

        if (secondNumber == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return;
        }

        double result = firstNumber / secondNumber;

        System.out.println("O resultado da divisão é: " + result);
    }

    static public void multiplyNumbers(){
        System.out.println("Digite o primeiro número:");
        double firstNumber = input.nextDouble();

        System.out.println("Digite o segundo número:");
        double secondNumber = input.nextDouble();

        double result = firstNumber * secondNumber;

        System.out.println("O resultado da multiplicação é: " + result);
    }

    static public void subtractNumbers(){
        System.out.println("Digite o primeiro número:");
        double firstNumber = input.nextDouble();

        System.out.println("Digite o segundo número:");
        double secondNumber = input.nextDouble();

        double result = firstNumber - secondNumber;

        System.out.println("O resultado da subtração é: " + result);
    }

    static public void exitSystem(){
        System.out.println("Sistema encerrado. Até mais!");
        System.exit(0);
    }

}
