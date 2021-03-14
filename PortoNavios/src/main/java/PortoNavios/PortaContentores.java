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
public class PortaContentores extends Navio{
    

      public int num_max_contentores;

      public PortaContentores (String matricula) {
            super(matricula);//passa parâmetro para o construtor da superclasse 
      }

    public int getNum_max_contentores() {
        return num_max_contentores;
    }

    public void setNum_max_contentores(int num_max_contentores) {
        this.num_max_contentores = num_max_contentores;
    } 
    
    public String toString() {
        return "Porta-Contentores{" + "Matricula= " + matricula + ", Nome= " + nome + ", Comprimento= " + comprimento + ", Número Máximo de Contentores= "+ num_max_contentores +'}';
    }
}