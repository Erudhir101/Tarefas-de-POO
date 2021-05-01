package com.mycompany.pooheranca;

import java.util.Scanner;

public class Curso implements Interface2 {
    private String nome;

    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirCurso() {
        System.out.println("Curso: " + getNome());
    }

    public void cadastrarCurso(Scanner scan) {
        System.out.println("---------- CADASTRO ----------");
        System.out.print("Digite o nome do curso: ");
        this.setNome(scan.next());
        Main.limparBuffer(scan);
        System.out.println("\n");
    }

    @Override
    public void listar() {
        System.out.println("\n----- CURSO -----");
        System.out.printf("Nome: %s", this.getNome());
        System.out.println("-------------------");
    }
}
