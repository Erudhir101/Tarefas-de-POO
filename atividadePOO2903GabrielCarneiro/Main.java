/*
Aluno: Gabriel Silva Carneiro - UC19200914
sintaxe: eh necessario criar e desenvolver as classes apresentadas na aula
objetivo: desenvolver o conteúdo ensinado na aula
 */
package com.mycompany.atividade2903.atividadePOO2903GabrielCarneiro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try ( Scanner scan = new Scanner(System.in)) {
            Aluno alu1 = new Aluno();
            alu1.lerAluno(scan);//lendo todas as caracteristicas pertencentes ao aluno e seus objetos relacionados
            alu1.mostrarAluno();//mostrando todas as caracteristicas pertencentes ao aluno e seus objetos relacionados
        }
    }
}
