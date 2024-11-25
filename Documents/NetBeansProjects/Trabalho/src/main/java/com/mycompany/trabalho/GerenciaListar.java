/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author tainara
 */
public class GerenciaListar {
    private ArrayList<Tarefa> tarefas;

    public GerenciaListar(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
    public void listarNomal(){
       
        for(Tarefa tar :tarefas){
            //System.out.println("TAREFA Nº "+ tarefas.size()+1);
            System.out.println("Titulo: " + tar.getTitulo());
            System.out.println("Descrição: "+ tar.getDescricao());
            System.out.println("Status:" + tar.getStats());
            System.out.println("Data de Vencimento:" + tar.getDataVencimento());
            System.out.println("--------------");
        }
        }
   public void listarStatus(){
       int op;
       Scanner sc = new Scanner(System.in);
       System.out.println("Escolha o Status: 1- Pendente 2- Em andamento 3- Concluido");
       op = sc.nextInt();
       for(Tarefa tar :tarefas){
           if(tar.getStats() == Stat.values()[op]){
               System.out.println("TAREFA Nº "+ tarefas.size()+1);
           System.out.println("Titulo: " + tar.getTitulo());
            System.out.println("Descrição: "+ tar.getDescricao());
            System.out.println("Status:" + tar.getStats());
            System.out.println("Data de Vencimento:" + tar.getDataVencimento());
           }
            
        }
   }
  public void listarData(){
        ArrayList<Tarefa> tarefasOrdenadas = new ArrayList<>();
        Collections.copy(tarefasOrdenadas, tarefas);

        // Ordenar o novo ArrayList por data de vencimento
        Collections.sort(tarefasOrdenadas, Comparator.comparing(Tarefa::getDataVencimento));
         for(Tarefa tar :tarefasOrdenadas){
            System.out.println("TAREFA Nº "+ tarefas.size()+1);
           System.out.println("Titulo: " + tar.getTitulo());
            System.out.println("Descrição: "+ tar.getDescricao());
            System.out.println("Status:" + tar.getStats());
            System.out.println("Data de Vencimento:" + tar.getDataVencimento());
           }
      
  } 
}
