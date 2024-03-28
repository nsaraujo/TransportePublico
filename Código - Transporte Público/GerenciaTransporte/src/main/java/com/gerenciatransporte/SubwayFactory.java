/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gerenciatransporte;

/**
 *
 * @author 55649
 */
public class SubwayFactory implements TransportationFactory{

    @Override
    public Transport cria_veiculo() {
        return new Subway(8, 180, "Cartão transporte", "linha 1", 5);
    }
    
}
