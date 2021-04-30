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
        
      
        System.out.println("---------- CADASTRO DO PROFESSOR ----------");
        
        endereco = new Endereco();
        
        System.out.println("Digite nome:"); 
        novoProf.setNome(scan.nextLine());
        
        System.out.println("Digite e-mail:"); 
        novoProf.setEmail(scan.nextLine());
        
        System.out.println("Digite CPF:"); 
        novoProf.setCpf(scan.nextLine());
        
        System.out.println("Digite Endereco:");
        System.out.println("Digite a rua:");
        endereco.setRua(scan.next());
        
        System.out.println("Digite a cidade:");
        endereco.setCidade(scan.next());
        
        System.out.println("Digite o estado:");
        endereco.setEstado(scan.next());
        
        novoProf.setEndereco(endereco);
        
        System.out.println("Digite seu telefone (máximo 2)");
           telefones = new ArrayList<>(); //instanciação do ArrayList de Telefones
        for (int i=0;i<2;i++){
            telefone = new Telefone(); //instanciando objeto telefone, para depois de preenchido, ser inserido no ArrayList
            //preenchimento do objeto teelfone
            System.out.println("Digite o tipo do telefone:");
            telefone.setTipo(scan.next());
            System.out.println("Digite o DDD:");
            telefone.setDdd(scan.next());
            System.out.println("Digite o telefone:");
            telefone.setNumero(scan.next());
            telefones.add(telefone);//inserção do objeto no ArrayList
        }
        
        novoProf.setTelefones(telefones); //inserção da lista de telefones ao professor
        
        System.out.println("Digite a titulação:"); 
        novoProf.setTitulacao(scan.next());
        
        System.out.println("Digite o salário:"); 
        novoProf.setSalario(scan.nextDouble());
        
        System.out.println("Digite os cursos (máximo 2)");
        for (int i=0;i<2;i++){
            curso = new Curso();
            System.out.println("Digite o curso:");
            curso.setNome(scan.next());
            cursos.add(curso);
        }
        
        novoProf.setCursos(cursos);
        
        System.out.println("---------- CADASTRO DO ALUNO ----------");
        endereco = new Endereco();
        
        System.out.println("Digite nome:"); 
        novoAluno.setNome(scan.next());
        
        System.out.println("Digite e-mail:"); 
        novoAluno.setEmail(scan.next());
        
        System.out.println("Digite CPF:"); 
        novoAluno.setCpf(scan.next());
        
        System.out.println("Digite endereco:");
        System.out.println("Digite a rua:");
        endereco.setRua(scan.next());
        
        System.out.println("Digite a cidade:");
        endereco.setCidade(scan.next());
        
        System.out.println("Digite o estado:");
        endereco.setEstado(scan.next());
        
        novoAluno.setEndereco(endereco);
        
        System.out.println("Digite seu telefone (máximo 2)");
         telefones = new ArrayList<>();
        for (int i=0;i<2;i++){ 
            telefone = new Telefone();
            System.out.println("Digite o tipo do telefone:");
            telefone.setTipo(scan.next());
            System.out.println("Digite o DDD:");
            telefone.setDdd(scan.next());
            System.out.println("Digite o telefone:");
            telefone.setNumero(scan.next());
            telefones.add(telefone);
        }
        
        novoAluno.setTelefones(telefones);
        
        curso = new Curso(); 
        System.out.println("Digite o curso:");
        curso.setNome(scan.next());
        
        novoAluno.setCurso(curso);
        
        System.out.println("Digite suas notas (máximo 2)");
        for (int i=0;i<2;i++){
            notas.add(scan.nextDouble()); 
        }
        novoAluno.setNotas(notas);
        
        novoProf.imprimir();
        novoAluno.imprimir();
    }    
}


