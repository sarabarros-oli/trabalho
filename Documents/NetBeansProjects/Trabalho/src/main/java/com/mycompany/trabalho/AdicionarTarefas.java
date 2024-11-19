/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;

import java.util.ArrayList;

/**
 *
 * @author sarah
 */
public class AdicionarTarefas {
    
   private  ArrayList<Tarefa>tarefas;

    public AdicionarTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
   
    public void adicionar(){
        Tarefa ta = new Tarefa();
        System.out.println("Titulo");
        ta.getTitulo();
        System.out.println("Descricao");
        ta.getDescricao();
        System.out.println("Data Vencimento");
        ta.getDataVencimento();
        System.out.println("Status");
        ta.getStats();
        tarefas.add(ta);
    }
}
