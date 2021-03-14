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
public class Navio {
    public String matricula;
    public String nome;
    public float comprimento;
    
    public Navio(String matricula){
        this.matricula = matricula;
        nome = null;
        comprimento = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
    @Override
    public String toString() {
        return "Navio{" + "Matricula=" + matricula + ", Nome=" + nome + ", Comprimento=" + comprimento + '}';
    }
}