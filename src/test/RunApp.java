/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import concreteobserver.GmailClients;
import concreteobserver.YahooClients;
import concretesubjects.Celular;
import interfaces.Observer;
import subject.Subject;

/**
 *
 * @author qt
 */
public class RunApp {
    public static void main(String[] args) {
        Observer gmail = new GmailClients();
        Observer yahoo = new YahooClients();
        Subject celular = new Celular("MotoX", 1854.58);
        
        celular.attach(gmail);
        celular.attach(yahoo);
        celular.Notify();
    }
}
