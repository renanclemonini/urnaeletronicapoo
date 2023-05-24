/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.ds1;

/**
 *
 * @author aluno
 */
public class Urna extends Apuracao{

    @Override
    public void setVotoConfirm_new() {
        
        Candidato c12 = new Candidato("Ciro", "Ana Paula", 12, "PDT");
        Candidato c13 = new Candidato("Lula", "Geraldo", 13, "PT");
        Candidato c14 = new Candidato("Padre Kelmon", "Pastor Gamonal", 14, "PTB");
        Candidato c22 = new Candidato("Bolsonaro", "General Heleno", 22, "PL");
        Candidato votoBranco = new Candidato("Voto em Branco", 0);
        Candidato votoNulo = new Candidato("Voto Nulo", 0);
        
        
    }
    
}
