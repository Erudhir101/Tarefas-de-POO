package com.mycompany.atividade2903.atividadePOO2903GabrielCarneiro;

import java.util.Scanner;

public class Professor {

    private String nome;
    private String titulacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void lerProfessor(Scanner scan) {
        System.out.println("----------- Cadastro de Professor -------------");
        System.out.println("Digite o nome:");
        setNome(scan.nextLine());
        System.out.println("Digite a titulacao:");
        setTitulacao(scan.nextLine());
    }

    public void mostrarProfessor() {
        System.out.println("\t--- caracteristicas do professor");
        System.out.println("nome: " + getNome());
        System.out.println("Titulacao: " + getTitulacao());
    }
}
