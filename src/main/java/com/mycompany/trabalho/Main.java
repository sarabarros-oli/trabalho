/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Main {
       public static void main(String[] args) {
        System.out.println("Hello World!");
           ArrayList<Tarefa> tarefa = new ArrayList<>();
         AdicionarTarefas ad =new AdicionarTarefas(tarefa);
         AlterarTarefas at=new AlterarTarefas(tarefa);
           Scanner sc = new Scanner(System.in);
           int op;
           do{
               System.out.println("Escolha uma opção: ");
               System.out.println("1- ADICIONAR ");
               System.out.println("2- ALTERAR ");
               System.out.println("3- DELETAR ");
               System.out.println("4 - LISTAR ");
               System.out.println("5- SAIR");
               System.out.println("Escolha uma opção: ");
               op = sc.nextInt();
               
               
               switch (op) {
                   case 1:
                       ad.adicionar();
                       break;
                   case 2:
                       at.alterar();
                       break;
                   case 3:
                       
                       break;
                   case 4:
                       
                       break;
                   case 5:
                       System.out.println("Encerrando programa");
                       break;    
                   default:
                       System.out.println("Opção inválida. Para sair digite '5'");
               }
           } while(op!=5);
           
    }
}
