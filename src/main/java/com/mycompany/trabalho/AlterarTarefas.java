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
public class AlterarTarefas {
   
    private ArrayList<Tarefa> tarefas;
    private Scanner sc = new Scanner(System.in);
    
    public AlterarTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
    public void alterar() {
        // Solicitar título da tarefa a ser alterada
        System.out.print("Digite o título da tarefa a ser alterada: ");
        String tituloBusca = sc.nextLine();
        
        // Localizar a tarefa com base no título
        Tarefa tarefaEncontrada = null;
        for (Tarefa t : tarefas) {
            if (t.getTitulo().equalsIgnoreCase(tituloBusca)) {
                tarefaEncontrada = t;
                break;
            }
        }
        
        if (tarefaEncontrada == null) {
            System.out.println("Tarefa não encontrada.");
            return;
        }
        
        // Exibir dados atuais da tarefa
        System.out.println("\nTarefa encontrada: ");
        System.out.println("Título: " + tarefaEncontrada.getTitulo());
        System.out.println("Descrição: " + tarefaEncontrada.getDescricao());
        System.out.println("Data de Vencimento: " + tarefaEncontrada.getDataVencimento());
        System.out.println("Status: " + tarefaEncontrada.getStats());

        // Perguntar ao usuário o que deseja alterar
        System.out.println("\nO que você deseja alterar?");
        System.out.println("1. Título");
        System.out.println("2. Descrição");
        System.out.println("3. Data de Vencimento");
        System.out.println("4. Status");
        System.out.println("5. Cancelar alteração");
        
        int opcao = sc.nextInt();
        sc.nextLine(); // Consumir o caractere de nova linha pendente
        
        switch (opcao) {
            case 1:
                System.out.print("Novo título: ");
                tarefaEncontrada.setTitulo(sc.nextLine());
                break;
            case 2:
                System.out.print("Nova descrição: ");
                tarefaEncontrada.setDescricao(sc.nextLine());
                break;
            case 3:
                System.out.print("Nova data de vencimento (formato yyyy-MM-dd): ");
                String novaData = sc.nextLine();
                tarefaEncontrada.setDataVencimento(LocalDate.parse(novaData));
                break;
            case 4:
                Tarefa.Stat novoStatus = escolherStatus();
                tarefaEncontrada.setStats(novoStatus);
                break;
            case 5:
                System.out.println("Alteração cancelada.");
                return;
            default:
                System.out.println("Opção inválida.");
                return;
        }
        
        // Confirmar alteração
        System.out.println("\nTarefa alterada com sucesso!");
        System.out.println("Título: " + tarefaEncontrada.getTitulo());
        System.out.println("Descrição: " + tarefaEncontrada.getDescricao());
        System.out.println("Data de Vencimento: " + tarefaEncontrada.getDataVencimento());
        System.out.println("Status: " + tarefaEncontrada.getStats());
    }

    private Tarefa.Stat escolherStatus() {
        System.out.println("Escolha o novo status da tarefa:");
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
