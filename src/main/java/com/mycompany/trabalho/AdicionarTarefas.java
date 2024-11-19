/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class AdicionarTarefas {
    
   private  ArrayList<Tarefa>tarefas;
   private Scanner sc= new Scanner(System.in);
    public AdicionarTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
   
    public void adicionar(){
        Tarefa ta = new Tarefa();
        System.out.println("Titulo");
        ta.setTitulo(sc.nextLine());
        System.out.println("Descricao");
        ta.setDescricao(sc.nextLine());
        System.out.println("Data Vencimento");
        String dataVencimento = sc.nextLine();
        ta.setDataVencimento(LocalDate.MIN);
        System.out.println("Status");
        String status=sc.nextLine(); // Consumir o caractere de nova linha pendente, se necessário
        ta.setStats(Tarefa.Stat.PENDENTE);
        tarefas.add(ta);
        /*System.out.println("Tarefa: " + tarefas.size());
        for(Tarefa t: tarefas){
            System.out.println("Titulo"+ t.getTitulo());
        }*/
    }
}
