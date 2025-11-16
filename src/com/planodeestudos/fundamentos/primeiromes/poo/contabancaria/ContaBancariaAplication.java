package com.planodeestudos.fundamentos.primeiromes.poo.contabancaria;

import com.planodeestudos.fundamentos.primeiromes.poo.contabancaria.controller.ContaController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBancariaAplication {

    static ContaController contaController = new ContaController();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { 
        iniciarPrograma();

    }

    public static void iniciarPrograma() {
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
                    case 1:
                        contaController.criarConta();
                        break;
                    case 2:
                        contaController.listarContas();
                        break;
                    case 3:
                        // acessarContaPorNumero();
                        break;
                    case 4:
                        // atualizarDadosDaContaPorNumero();
                        break;
                    case 5:
                        // deletarContaPorNumero();
                        break;
                    case 6:
                        System.out.println("Saindo do sistema...");
                        System.exit(0);
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

            } while (true); 
        } catch(InputMismatchException e){
            System.out.println("Entrada inválida, escolha uma opção numérica. Encerrando o sistema.");
            return;
        }
    }
}
