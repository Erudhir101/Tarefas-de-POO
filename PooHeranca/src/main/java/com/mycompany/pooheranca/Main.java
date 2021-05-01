package com.mycompany.pooheranca;
/*
HERANÇA SIMPLES
O conceito de herança é um dos conceitos fundamentais de POO. 
Herança, na prática, significa a possibilidade de construir objetos especializados que herdam 
as características de objetos mais generalistas, ou ainda, a herança uma maneira de reutilizar 
código a medida que podemos aproveitar os atributos e métodos de classes já existentes para gerar 
novas classes mais específicas que aproveitarão os recursos da classe hierarquicamente superior.

Superclasses e subclasses
Em POO todo objeto de uma classe construída pelo usuário da linguagem é também um objeto de outra classe. 
Podemos afirmar isso pois, por exemplo, em Java existe um objeto de qual todas as classes são originadas 
que é o Object.

Nesse exemplo, as classes Professor e Aluno (subclasses) herdam a classe Pessoa (superclasse).

A herança normalmente produz subclasses mais especializadas, mais específicas, que as superclasses. 
Notem que, o termo subclasses pode trazer a idéia errada de que uma subclasse possa ter menos recursos
que a superclasse mas ocorre exatamente o inverso, uma subclasse é mais especializada que a superclasse.

O modificar final pode ser usado em classes que não podem ser especilizadas. 

Também há o conceito de herança múltipla, que permite a um objeto herdar as características de mais de uma superclasse.
No entanto, o java não implementa herança múltipla. 

Fonte: http://dcm.ffclrp.usp.br/~evandro/ibm1030/constru/heranca.html
*/

import java.util.Collections;
import java.util.List;
/*List é um dos três grandes tipos da Collection, sendo eles: List, Set e Maps.
Neste algoritmo utilizamos a classe ArrayList, do tipo List
Sobre a lista:
É uma coleção de OBJETOS armazenados linearmente.
Cada elemento tem seu sucessor e o seu antecessor, com exceção do primeiro e último. 
Listas podem ser mantidas ordenadas ou não.
Há controle na posição de inserção ou remoção.
O acesso aos elementos se dá pelo índice. 

Sobre List, acesse: https://slideplayer.com.br/slide/16864713/
*/
import java.util.ArrayList;
//Acesse o conteúdo sobre ArrayList em: https://www.w3schools.com/java/java_arraylist.asp
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Curso> cursos = new ArrayList<>(); //Instanciação do ArrayList de Cursos
        Curso curso; //Declaração da variável curso, do tipo Curso, que será instanciado logo abaixo. 

        Aluno novoAluno = new Aluno(); //Instanciação do objeto Aluno
        List<Double> notas = new ArrayList<>(); //Instanciação do ArrayList de Cursos

        List<Telefone> telefones; //Declaração do ArrayList de Telefones, que será instanciado logo abaixo.
        Telefone telefone; //Declaração do objeto Telefone, que será instanciado logo abaixo.

        Professor novoProf = new Professor(); //Instanciação do objeto Professor
        Endereco endereco; //Declaração do objeto Endereco, que será instanciado logo abaixo.

        //novoProf.cadastrarProfessor(scan);
        novoAluno.cadastrarAluno(scan);

    novoAluno.imprimir();
//        novoProf.imprimir();
//        novoAluno.imprimir();
    }

    // para limpara o buffer de teclado
    public static void limparBuffer(Scanner scan) {
        if (scan.hasNextLine()) {
            scan.nextLine();
        }
    }
}


