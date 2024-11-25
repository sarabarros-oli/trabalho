/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Rafaela
 */

public class ExcluirTarefas {

    private ArrayList<Tarefa> tarefas;
    private Scanner sc = new Scanner(System.in);

    public ExcluirTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void excluir() {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas para excluir.");
            return;
        }

        System.out.println("Tarefas disponíveis:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i).getTitulo());
        }

        System.out.print("Digite o título da tarefa que deseja excluir: ");
        String titulo = sc.nextLine();

        Iterator<Tarefa> iterator = tarefas.iterator();
        boolean encontrada = false;

        while (iterator.hasNext()) {
            Tarefa tarefa = iterator.next();
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                iterator.remove();
                encontrada = true;
                System.out.println("Tarefa \"" + titulo + "\" excluída com sucesso.");
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Tarefa com o título \"" + titulo + "\" não encontrada.");
        }

        System.out.println("\nLista atualizada de tarefas:");
        for (Tarefa t : tarefas) {
            System.out.println("Título: " + t.getTitulo());
            System.out.println("Descrição: " + t.getDescricao());
            System.out.println("Data de Vencimento: " + t.getDataVencimento());
            System.out.println("Status: " + t.getStats());
            System.out.println("----------");
        }
    }
}

