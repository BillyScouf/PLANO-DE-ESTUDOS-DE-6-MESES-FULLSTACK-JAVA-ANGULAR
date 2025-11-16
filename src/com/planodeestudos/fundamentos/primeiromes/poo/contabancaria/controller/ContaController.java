package com.planodeestudos.fundamentos.primeiromes.poo.contabancaria.controller;

import com.planodeestudos.fundamentos.primeiromes.poo.contabancaria.entity.Conta;
import com.planodeestudos.fundamentos.primeiromes.poo.contabancaria.service.ContaSerivce;

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

}
