package com.mycompany.atividade2903.atividadePOO2903GabrielCarneiro;

import java.util.Scanner;

public class Aluno {

    private String nome;
    private Curso curso;
    private Disciplina disciplina;
    private Campus campus;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public void lerAluno(Scanner scan) {
        System.out.println("----------- Cadastro de Aluno -------------");
        System.out.println("Digite o seu nome:");
        setNome(scan.nextLine());
        Curso cur = new Curso();
        cur.lerCurso(scan);
        setCurso(cur);
        Disciplina dir = new Disciplina();
        dir.lerDisciplina(scan);
        setDisciplina(dir);
        Campus camp = new Campus();
        camp.lerCampus(scan);
        setCampus(camp);
    }

    public void mostrarAluno() {
        System.out.println("\t--- caracteristicas do Aluno");
        System.out.println("nome: " + getNome());
        getCurso().mostrarCurso();
        getDisciplina().mostrarDisciplina();
        getCampus().mostrarCampus();
    }
}
