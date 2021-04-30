
package com.mycompany.pooheranca;

//Subclasse

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa implements Interface1 {

    private Curso curso;
    private List<Double> notas;

    public Aluno() {
        super(); //chama o contrutor da superclasse
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }


    @Override
    public void imprimir() {
        System.out.println("\n---------- DADOS DO ALUNO ----------");
        super.imprimir();
        getCurso().imprimirCurso();
        System.out.println("Notas");
        for (int x = 0; x < getNotas().size(); x++) {
            System.out.println(getNotas().get(x).toString());
        }

    }

    public void cadastrarAluno(Scanner scan) {
        System.out.println("---------- CADASTRO DO ALUNO ----------\n");
        this.cadastrarPessoa(scan);//Cadastrar as caracteristicas de usuario no aluno
        curso = new Curso();
        curso.cadastrarCurso(scan);//Cadastrar curos
        this.setCurso(curso);
        notas = new ArrayList<>();
        System.out.println("Digite suas notas (máximo 2)");
        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite a %d nota: ", i + 1);
            this.getNotas().add(scan.nextDouble());//colocando a lista de notas dentro do aluno
            Main.limparBuffer(scan);
        }
    }

}