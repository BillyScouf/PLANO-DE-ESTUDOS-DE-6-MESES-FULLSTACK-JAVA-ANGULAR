package com.planodeestudos.primeiromes;

import java.util.Scanner;

public class Conversor {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        startSystem();
        input.close();
    }

    public static void startSystem() {
        do { 
            System.out.println("Conversor Iniciado!");
        System.out.println("Voce pode converter unidades agora.");
        System.out.println("1 - Converter Celsius para Fahrenheit");
        System.out.println("2 - Converter Fahrenheit para Celsius");
        System.out.println("0 - Sair do sistema");
        
        int option = input.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("Opção de conversão Celsius para Fahrenheit escolhida com sucesso!");
                convertCelsiusToFahrenheit();
            }
            case 2 -> {
                System.out.println("Opção de conversão Fahrenheit para Celsius escolhida com sucesso!");
                convertFahrenheitToCelsius();
            }
            case 0 -> {
                System.out.println("Saindo do sistema...");
                System.exit(0);
            }
            default ->{
                System.out.println("Opção inválida");
                System.out.println("Tente novamente");
            }
        }
        } while (true);
    }

    public static String convertCelsiusToFahrenheit() {
        System.out.println("Digite a temperatura em Celsius:");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        String result = celsius + "°C é igual a " + fahrenheit + "°F";
        System.out.println(result);
        return result;
    }

    public static String convertFahrenheitToCelsius() {
        System.out.println("Digite a temperatura em Fahrenheit:");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        String result = fahrenheit + "°F é igual a " + celsius + "°C";
        System.out.println(result);
        return result;
    }
}
