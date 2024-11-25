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
   
   public void adicionar() {
        Tarefa ta = new Tarefa();

        System.out.println("Título:");
        ta.setTitulo(sc.nextLine());

        System.out.println("Descrição:");
        ta.setDescricao(sc.nextLine());

        System.out.println("Data de Vencimento (formato yyyy-MM-dd):");
        String dataVencimento = sc.nextLine();
        ta.setDataVencimento(LocalDate.parse(dataVencimento));

        Tarefa.Stat status = escolherStatus();
        ta.setStats(status); 

        tarefas.add(ta); 

        System.out.println("Tarefa adicionada com sucesso!");
        for (Tarefa t : tarefas) {
            System.out.println("\nTítulo: " + t.getTitulo());
            System.out.println("Descrição: " + t.getDescricao());
            System.out.println("Data de Vencimento: " + t.getDataVencimento());
            System.out.println("Status: " + t.getStats());
        }
    }
     private Tarefa.Stat escolherStatus() {
        System.out.println("Escolha o status da tarefa:");
        Tarefa.Stat[] statuses = Tarefa.Stat.values();

        for (int i = 0; i < statuses.length; i++) {
            System.out.println((i + 1) + ". " + statuses[i]);
        }

        int escolha;
        while (true) {
            System.out.print("Digite o número correspondente ao status: ");
            escolha = sc.nextInt();
            sc.nextLine(); // Consumir o caractere de nova linha pendente

            if (escolha > 0 && escolha <= statuses.length) {
                return statuses[escolha - 1];
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    
}
