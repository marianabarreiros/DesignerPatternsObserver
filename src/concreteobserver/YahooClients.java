/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concreteobserver;

import interfaces.Observer;

/**
 *
 * @author qt
 */
public class YahooClients implements Observer{

    @Override
    public void update() {
        System.out.println("Cliente Yahoo recebendo atualização do produto");
    }
    
}
