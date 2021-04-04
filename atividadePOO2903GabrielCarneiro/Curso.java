package com.mycompany.atividade2903.atividadePOO2903GabrielCarneiro;

import java.util.Scanner;

public class Curso {

    private String nome;
    private int duracao;
    private String coordenador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public void lerCurso(Scanner scan) {
        System.out.println("----------- Cadastro de Curso -------------");
        System.out.println("Digite o nome: ");
        setNome(scan.nextLine());
        System.out.println("Duracao do curso: ");
        setDuracao(scan.nextInt());
        System.out.println("Nome do coordenador: ");
        scan.nextLine();
        setCoordenador(scan.nextLine());
    }

    public void mostrarCurso() {
        System.out.println("\t--- caracteristicas do Curso");
        System.out.println("nome: " + getNome());
        System.out.println("Duracao: " + getDuracao());
        System.out.println("Nome do coordenador: " + getCoordenador());
    }
}
