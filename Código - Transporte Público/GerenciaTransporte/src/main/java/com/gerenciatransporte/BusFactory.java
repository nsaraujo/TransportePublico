/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gerenciatransporte;

/**
 *
 * @author 55649
 */
public class BusFactory implements TransportationFactory{
    
    @Override
    public Transport cria_veiculo() {
        return new Bus(50, "PIX", 90, "Vila brasilia", 0);
    }

}
