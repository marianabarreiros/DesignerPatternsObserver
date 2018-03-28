/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concreteobserver;

import concretesubjects.Celular;
import interfaces.Observer;

/**
 *
 * @author Win-7
 */
public class GmailClients implements Observer{

    @Override
    public void update() {
        System.out.println("Cliente G-mail recebendo atualização do produto");
    }
}
