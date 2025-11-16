package com.planodeestudos.fundamentos.primeiromes.poo.contabancaria.controller;

import com.planodeestudos.fundamentos.primeiromes.poo.contabancaria.entity.Conta;
import com.planodeestudos.fundamentos.primeiromes.poo.contabancaria.service.ContaSerivce;
import java.util.List;

public class ContaController {

    private ContaSerivce contaService;

    // Métodos de controle que interagem com a camada de serviço

    public ContaController() { 
        this.contaService = new ContaSerivce();
    }

    // Criar conta
    public void criarConta() {
        contaService.criarConta();
        System.out.println("Conta criada com sucesso: " + contaService);
    }

    // Listar contas
    public void listarContas() {
        List<Conta> listaDeContas = contaService.listarContas();

        if (listaDeContas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            System.out.println("=== Lista de Contas Cadastradas ===");
            listaDeContas.forEach(conta -> {
                System.out.println("Número da Conta: " + conta.getNumeroConta() + "");
            });
        }
    }

}
