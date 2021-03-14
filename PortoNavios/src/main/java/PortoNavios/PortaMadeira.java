/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PortoNavios;

/**
 *
 * @author ritar
 */
public class PortaMadeira extends Navio{
    

      public int num_max_toneladas;

      public PortaMadeira (String matricula) {
            super(matricula);//passa parâmetro para o construtor da superclasse 
      }

    public int getNum_max_toneladas() {
        return num_max_toneladas;
    }

    public void setNum_max_toneladas(int num_max_toneladas) {
        this.num_max_toneladas = num_max_toneladas;
    } 
    
      @Override
    public String toString() {
        return "Porta-Madeira{" + "Matricula= " + matricula + ", Nome= " + nome + ", Comprimento= " + comprimento + ", Número Máximo de Toneladas= "+ num_max_toneladas +'}';
    }
}