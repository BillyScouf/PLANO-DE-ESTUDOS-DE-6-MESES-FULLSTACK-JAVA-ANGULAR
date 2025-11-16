package com.planodeestudos.fundamentos.primeiromes.poo.contabancaria;

import com.planodeestudos.fundamentos.primeiromes.poo.contabancaria.controller.ContaController;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBancariaAplication {

    static ContaController contaController = new ContaController();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { 
        
        try {
            System.out.println("Iniciando o sistema de Conta Bancária...");
            System.out.println("===============================");
            System.out.println("1. Visualizar Titular");
            System.out.println("2. Visualizar Conta Bancária");
            System.out.println("===============================");
            int escolherPerfil = scanner.nextInt();

        switch (escolherPerfil) {
            case 1 ->{
                // iniciarProgramaTitular()
            }
                
            case 2 ->{
                iniciarProgramaConta();
            }
            default -> {
                System.out.println("Opção inválida. Encerrando o sistema.");
                return;
            }
        }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida, escolha uma opção numérica. Encerrando o sistema.");
            return;
        }
    }

    public static void iniciarProgramaConta() {
        try{
            System.out.println("Aplicação de Conta Bancária em POO");
        
            do {
                System.out.println("=== Menu Conta Bancária ===");
                System.out.println("Bem-vindo ao Sistema de Conta Bancária");
                System.out.println("1. Criar Conta");
                System.out.println("2. Listar Contas");
                System.out.println("3. Acessar Conta por Número de conta");
                System.out.println("4. Atualizar Dados da Conta por Número de conta");
                System.out.println("5. Deletar Conta por Número de conta");
                System.out.println("6. Sair");
                System.out.print("Escolha uma opção: ");
                int opcaoEscolhida = scanner.nextInt(); // Deve ser substituído pela leitura da entrada do usuário

                switch (opcaoEscolhida) {
                    case 1 -> {
                        contaController.criarConta();
                    }
                    case 2 -> {
                        contaController.listarContas();
                    }
                    case 3 -> {         
                        // acessarContaPorNumero();
                    }
                    case 4 -> {
                        // atualizarDadosDaContaPorNumero();
                    }
                    case 5 -> {
                        // deletarContaPorNumero();
                    }
                    case 6 -> {     
                        System.out.println("Saindo do sistema...");
                        System.exit(0);
                    }
                    default -> {
                        System.out.println("Opção inválida. Tente novamente.");
                    }
                }

            } while (true); 
        } catch(InputMismatchException e){
            System.out.println("Entrada inválida, escolha uma opção numérica. Encerrando o sistema.");
            return;
        }
    }
}
