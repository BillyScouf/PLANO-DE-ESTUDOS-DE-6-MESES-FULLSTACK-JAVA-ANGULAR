package com.planodeestudos.fundamentos.primeiromes.poo.contabancaria.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.planodeestudos.fundamentos.primeiromes.poo.contabancaria.entity.Conta;

public class ContaSerivce {

    static Scanner scanner = new Scanner(System.in);
    static List<Conta> contas = new ArrayList<>();

    // Métodos de serviço relacionados à Conta Bancária podem ser adicionados aqui

    // Criar uma nova conta
    public void criarConta() throws InputMismatchException {
        try {
            System.out.println("Criando uma nova conta...");
            System.out.print("Digite o seu numero : ");
            int numeroDaConta = scanner.nextInt(); 

            System.out.println("Digite o saldo inicial: ");
            double saldoInicial = scanner.nextDouble(); 

            if(contas.stream().anyMatch(c -> c.getNumeroConta() == numeroDaConta)) {
                System.out.println("Número de conta já existe. Conta não criada.");
                return;
            }else {

                if(saldoInicial >= 0) {
                    System.out.println("Conta criada com sucesso para " + numeroDaConta + " com saldo inicial de R$ " + saldoInicial);    

                    Conta novaConta = new Conta(numeroDaConta, saldoInicial);

                    contas.add(novaConta);

                    System.out.println("Conta criada com sucesso! Número da conta: ");
                    } else {
                    System.out.println("Saldo inicial não pode ser negativo. Conta não criada.");
                    return;
                }
            }   
        
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, tente novamente.");
            scanner.nextLine(); // Limpar o buffer do scanner
        }
    }

    public List<Conta> listarContas() {
        return contas;
    }

}
