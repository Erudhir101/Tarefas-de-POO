package com.mycompany.atividade2903.atividadePOO2903GabrielCarneiro;

import java.util.Scanner;

public class Disciplina {

    private String nome;
    private byte ch;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getCh() {
        return ch;
    }

    public void setCh(byte ch) {
        this.ch = ch;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void lerDisciplina(Scanner scan) {
        System.out.println("----------- Cadastro de Disciplina -------------");
        System.out.println("Digite o nome:");
        setNome(scan.nextLine());
        System.out.println("Duracao do curso:");
        setCh(scan.nextByte());
        scan.nextLine();
        Professor prof = new Professor();
        prof.lerProfessor(scan);
        setProfessor(prof);
    }

    public void mostrarDisciplina() {
        System.out.println("\t--- caracteristicas da Disciplina ");
        System.out.println("nome: " + getNome());
        System.out.println("Quantidade de CH: " + getCh());
        getProfessor().mostrarProfessor();
    }
}
