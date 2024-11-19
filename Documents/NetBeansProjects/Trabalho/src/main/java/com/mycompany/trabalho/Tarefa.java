/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;

import java.time.LocalDate;

/**
 *
 * @author tainara
 */
public class Tarefa {
     enum Stat{
         PENDENTE,
         EM_ANDADAMENTO,
         CONCLUIDO
     }
    private String titulo;
    private String descricao;
    private LocalDate dataVencimento;
    private Stat stats;
    

    public Tarefa() {
    }

    public Tarefa(String titulo, String descricao, LocalDate dataVencimento, Stat stats) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.stats = stats;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Stat getStats() {
        return stats;
    }

    public void setStats(Stat stats) {
        this.stats = stats;
    }
    
    
}
