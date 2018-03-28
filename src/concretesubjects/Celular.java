/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretesubjects;

import subject.Subject;

/**
 *
 * @author Win-7
 */
public class Celular extends Subject {
    private String modelo;
    private Double valor;

    public Celular(String modelo, Double valor) {
        this.modelo = modelo;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
        this.Notify();
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
        this.Notify();
    }
    
    
    
}
