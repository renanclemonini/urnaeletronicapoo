/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.ds1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Candidato {
    
    private String nome;
    private String vice;
    private int numero;
    private String partido;
    private int votos;

    public Candidato() {
    }

    public Candidato(String nome, String vice, int numero, String partido) {
        this.nome = nome;
        this.vice = vice;
        this.numero = numero;
        this.partido = partido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVice() {
        return vice;
    }

    public void setVice(String vice) {
        this.vice = vice;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    

    @Override
    public String toString() {
        return "Candidato{" + "nome=" + nome + ", vice=" + vice + ", numero=" + numero + ", partido=" + partido + '}';
    }
    
    

}
