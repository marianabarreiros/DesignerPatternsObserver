/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subject;

import interfaces.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Win-7
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    
    public void attach(Observer obs){
        observers.add(obs);
        System.out.println("Observador " + obs.getClass().getSimpleName() + " adicionado.");
    }
    
    public void detach(Observer obs){
        observers.remove(obs);
        System.out.println("Observador " + obs.getClass().getSimpleName() + " deletado.");
    }
    
    public void Notify(){
        observers.forEach(s -> s.update());
    }
}   
