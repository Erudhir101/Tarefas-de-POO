package com.mycompany.pooheranca;

//Subclasse

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa implements Interface1 {
    /*
    As subclasses são vinculadas a classe genérica (superclasses)
    utilizando o comando extends

    Não é necessário redefinir o conteúdo já declarado na classe mãe (superclasse).
    Assim sendo, this funcionároa tanto para elementos da superclasse quanto da subclasse.
    Quando houver ambiguidade, basta utilizar o super para se referir a superclasse.
    */
    private String titulacao;
    private double salario;
    private List<Curso> cursos;

    /*
    No construtor da subclasse é necessário construir a superclasse utilando super();
    */
    public Professor() {
        super();
    }

    /*
    Para utilizar uma variável ou invocar um método da classe mãe (superclasse) é utilizada a palavra
    reservada super (analoga ao this)
    */
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    //Sobre overriding, ou sobreposição de métodos, acesse: https://pt.slideshare.net/ludimila_monjardim/poo-19sobrecarga-sobreposio
    /*
    Sobreposição de métodos (override) em programação orientada a objetos, é um recurso da linguagem que permite que a subclasse, 
    rescreva uma implementação especifica de um método que já esta previsto em uma superclasse. A implementação na subclasse sobrepõe 
    a implementação na superclasse.
    */

    @Override
    public void imprimir() {
        System.out.println("\n---------- DADOS DO PROFESSOR ----------");
        super.imprimir();//o super acessa a classe mãe, nesse caso Pesssoa, e executa o método imprimir.
        System.out.println("Titulação: " + getTitulacao());
        System.out.println("Salário: " + getSalario());
        for (int x = 0; x < getCursos().size(); x++) {
            getCursos().get(x).imprimirCurso();
        }
    }

    public void cadastrarProfessor(Scanner scan) {
        System.out.println("---------- CADASTRO DO PROFESSOR ----------\n");
        this.cadastrarPessoa(scan);//Cadastrar as caracteristicas de usuario no professor
        System.out.print("Digite a titulação: ");
        this.setTitulacao(scan.next());
        Main.limparBuffer(scan);
        System.out.print("Digite o salário: ");
        this.setSalario(scan.nextDouble());
        Main.limparBuffer(scan);
        List<Curso> curs = new ArrayList<>();//instanciação do ArrayList de Cursos
        System.out.println("Digite os cursos (máximo 2)");
        for (int i = 0; i < 2; i++) {
            Curso curso = new Curso();
            curso.cadastrarCurso(scan);
            curs.add(curso);
        }
        this.setCursos(curs);//colocando a lista de cursos dentro do professor
    }
}
