package com.mycompany.trabalho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author tainara
 */
public class GerenciaListar {

    private final ArrayList<Tarefa> tarefas;

    public GerenciaListar(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void listarNomal() {
        int esc;
        System.out.println("1- Listagem por ordem de adição ");
        System.out.println("2- Listagem por ordem de status ");
        System.out.println("3- Listagem por ordem por data de Vencimento ");
        Scanner scanner = new Scanner(System.in);
        esc = scanner.nextInt();
        if(esc == 1) {
            for (Tarefa tar : tarefas) {
                //System.out.println("TAREFA Nº "+ tarefas.size()+1);
                System.out.println("Titulo: " + tar.getTitulo());
                System.out.println("Descrição: " + tar.getDescricao());
                System.out.println("Status:" + tar.getStats());
                System.out.println("Data de Vencimento:" + tar.getDataVencimento());
                System.out.println("--------------");
            }
        } else if (esc == 2) {
            int op;
            Scanner sc = new Scanner(System.in);
            System.out.println("Escolha o Status: 1- Pendente 2- Em andamento 3- Concluido");
            op = sc.nextInt();
            for (Tarefa tar : tarefas) {
                if (tar.getStats() == Stat.values()[op - 1]) {

                    System.out.println("Titulo: " + tar.getTitulo());
                    System.out.println("Descrição: " + tar.getDescricao());
                    System.out.println("Status:" + tar.getStats());
                    System.out.println("Data de Vencimento:" + tar.getDataVencimento());
                    System.out.println("--------------");
                }
            }
        } else if (esc == 3) {

            ArrayList<Tarefa> tarefasOrdenadas = new ArrayList<>();
            for (Tarefa t : tarefas) {
                tarefasOrdenadas.add(t);
            }

            // Ordenar o novo ArrayList por data de vencimento
            Collections.sort(tarefasOrdenadas, Comparator.comparing(Tarefa::getDataVencimento));
            for (Tarefa tar : tarefasOrdenadas) {
                System.out.println("Titulo: " + tar.getTitulo());
                System.out.println("Descrição: " + tar.getDescricao());
                System.out.println("Status:" + tar.getStats());
                System.out.println("Data de Vencimento:" + tar.getDataVencimento());
                System.out.println("--------------");
            }

        }
    }

}
