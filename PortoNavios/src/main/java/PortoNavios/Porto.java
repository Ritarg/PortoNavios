/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PortoNavios;

import java.util.ArrayList;

/**
 *
 * @author ritar
 */
public class Porto {
    
public ArrayList<Navio> navios;
    
    public Porto(){
        navios = new ArrayList<>();
    }
    
    void inserir(Navio n) {
        if(buscar(n.matricula) == null)    
        navios.add(n);
    }
    
    public Navio buscar(String matricula){
        for(Navio n:navios)
            if(matricula == null ? n.matricula == null : matricula.equals(n.matricula))
                return n;
        return null;
    }
    
    public void listar(){
        navios.forEach(n -> {
            System.out.println(n);  
    });
    }
}
