/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;

import java.util.ArrayList;

/**
 *
 * @author tainara
 */
public class GerenciaListar {
    private ArrayList<Tarefa> tarefas;

    public GerenciaListar(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
    public void inicial(){
        for(Tarefa tar :tarefas){
            System.out.println("TAREFA Nº "+ tarefas.size()+1);
            System.out.println("Titulo: " + tar.getTitulo());
            System.out.println("Descrição: "+ tar.getDescricao());
            System.out.println("Status:" + tar.getStats());
            System.out.println("Data de Vencimento:" + tar.getDataVencimento());
        }
        }
   
}
