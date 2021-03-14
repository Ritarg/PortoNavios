/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PortoNavios;

/**
 *
 * @author Acer
 */

public class Petroleiro extends Navio{
    
    public float capacidade_carga;

      public Petroleiro(String matricula) {
            super(matricula);//passa parâmetro para o construtor da superclasse 
      }


    public float getCapacidade_carga() {
        return capacidade_carga;
    }

    public void setCapacidade_carga(float capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }
    
    @Override
    public String toString() {
        return "Petroleiro{" + "Matricula= " + matricula + ", Nome= " + nome + ", Comprimento= " + comprimento + ", Capacidade Carga= "+ capacidade_carga + " toneladas" +'}';
    }

}
