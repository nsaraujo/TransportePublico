/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gerenciatransporte;

/**
 *
 * @author 55649
 */
public class Subway extends SubwayFactory implements Transport{
    private int capacidade_passageiro;
    private double velocidade_media;
    private String metodo_pagamento;
    private String linha;
    private int passageiro_abordo;

    public Subway(int capacidade_passageiro, double velocidade_media, String metodo_pagamento, String linha, int passageiro_abordo) {
        this.capacidade_passageiro = capacidade_passageiro;
        this.velocidade_media = velocidade_media;
        this.metodo_pagamento = metodo_pagamento;
        this.linha = linha;
        this.passageiro_abordo = passageiro_abordo; 
    }

    public int getCapacidade_passageiro() {
        return capacidade_passageiro;
    }

    public void setCapacidade_passageiro(int capacidade_passageiro) {
        this.capacidade_passageiro = capacidade_passageiro;
    }

    public double getVelocidade_media() {
        return velocidade_media;
    }

    public void setVelocidade_media(double velocidade_media) {
        this.velocidade_media = velocidade_media;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public int getPassageiro_abordo() {
        return passageiro_abordo;
    }

    public void setPassageiro_abordo(int passageiro_abordo) {
        this.passageiro_abordo = passageiro_abordo;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }
    
    

    public void exibir_info_transporte() {
        System.out.println("Metrô - Capacidade: " + capacidade_passageiro + " passageiros");
        System.out.println("Velocidade média: " + velocidade_media + " km/h");
        System.out.println("Método de pagamento: " + metodo_pagamento);
        System.out.println("Linha de origem: " + linha);
        System.out.println("Quantidade de " + passageiro_abordo + " passageiros a bordo");
    }

    public void gera_rota(String origem, String destino) {
        System.out.println("Gerando rota para metrô da linha " + linha + " de " + origem + " para " + destino);
    }

    public void embarca_passageiro() {
        if (passageiro_abordo < capacidade_passageiro) {
            passageiro_abordo++;
            System.out.println("Passageiro embarcado. Total de: " + passageiro_abordo + " a bordo");
        } else {
            System.out.println("Metrô com lotação máxima, não é possível embarcar mais passageiros.");
        }
    }

    public void desembarca_passageiro() {
        if (passageiro_abordo > 0) {
            passageiro_abordo--;
            System.out.println("Passageiro desembarcado. Total de: " + passageiro_abordo + " a bordo");
        } else {
            System.out.println("O Metrô está vazio, não há passageiros para desembarcar.");
        }
    }
    
    public int getVagasDisponiveis() {
        return capacidade_passageiro - passageiro_abordo;
    }

    public int getCapacidade() {
        return capacidade_passageiro;
    }

    public int getPassageirosABordo() {
        return  passageiro_abordo;
    }
}
