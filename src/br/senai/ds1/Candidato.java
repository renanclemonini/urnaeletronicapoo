package br.senai.ds1;

public class Candidato{
    
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
        this.votos = 0;
    }
    
    public Candidato(String nome, int votos){
        this.nome = nome;
        this.votos = votos;
    }
    
    public void setVotos(Candidato candidato){
        candidato.setVotos(candidato.getVotos()+1);
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
        return "Candidato{" + " nome: " + nome + " - votos: " + votos + '}';
    }
}

