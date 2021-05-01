package com.mycompany.pooheranca;

import java.util.ArrayList;
import java.util.Scanner;

public class Telefone implements Interface2 {
    private String tipo;
    private String ddd;
    private String numero;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void imprimirTelefone() {
        System.out.println("Telefone: " + getTipo() + ": (" + getDdd() + ") " + getNumero());
    }

    public void cadastrarTelefone(Scanner scan) {
        System.out.println("---------- CADASTRO DE TELEFONE ----------");
        System.out.print("Digite o tipo do telefone: ");
        this.setTipo(scan.next());
        Main.limparBuffer(scan);
        System.out.print("Digite o DDD: ");
        this.setDdd(scan.next());
        Main.limparBuffer(scan);
        System.out.print("Digite o telefone: ");
        this.setNumero(scan.next());
        Main.limparBuffer(scan);
        System.out.println("\n");
    }

    @Override
    public void listar() {
        System.out.println("\n----- TELEFONE ------");
        System.out.printf("Tipo: %s", this.getTipo());
        System.out.printf("DDD: %s", this.getDdd());
        System.out.printf("Numero: %s", this.getNumero());
        System.out.println("-------------------");
    }
}


