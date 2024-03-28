/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gerenciatransporte;

/**
 *
 * @author 55649
 */
public interface Transport {
    public void exibir_info_transporte();
    public void gera_rota(String origem, String destino);
    public void embarca_passageiro();
    public void desembarca_passageiro();
    public int getCapacidade();
    public int getPassageirosABordo();
    public int getVagasDisponiveis();
}
