/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gerenciatransporte;

/**
 *
 * @author 55649
 */
public class GerenciaTransporte {

    public static void main(String[] args) {
        
        TransportationFactory onibus = new BusFactory();
        Transport bus = onibus.cria_veiculo();
        bus.exibir_info_transporte();

        
        bus.gera_rota("Terminal Vila Brasília", "Terminal Central");

        bus.embarca_passageiro();
        bus.embarca_passageiro();
        bus.embarca_passageiro();
        
        bus.desembarca_passageiro();

        System.out.println("Capacidade total: " + bus.getCapacidade());
        System.out.println("Quantidade de vagas disponíveis: " + bus.getVagasDisponiveis());
        System.out.println("Toral de " + bus.getPassageirosABordo() + " passageiros a bordo " );
        
        
        System.out.println("----------------------------------------------------------------------------\n");

        
        TransportationFactory metro = new SubwayFactory();
        Transport subway = metro.cria_veiculo();
        subway.exibir_info_transporte();
        
        bus.gera_rota("Linha Norte", "Linha Sudeste");
        
        subway.embarca_passageiro();
        subway.embarca_passageiro();
        subway.embarca_passageiro();
        subway.embarca_passageiro();
        subway.embarca_passageiro();
        subway.embarca_passageiro();
        
        subway.desembarca_passageiro();
        subway.desembarca_passageiro();
        subway.desembarca_passageiro();
        
        System.out.println("Capacidade total: " + subway.getCapacidade());
        System.out.println("Quantidade de vagas disponíveis: " + subway.getVagasDisponiveis());
        System.out.println("Total de " + subway.getPassageirosABordo() + " passageiros a bordo " );

        
    }
}

