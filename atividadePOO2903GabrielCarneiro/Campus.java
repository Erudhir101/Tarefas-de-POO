package com.mycompany.atividade2903.atividadePOO2903GabrielCarneiro;

import java.util.Scanner;

public class Campus {

    private String nome;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void lerCampus(Scanner scan) {
        System.out.println("----------- Cadastro de Campus -------------");
        System.out.println("Digite o nome:");
        setNome(scan.nextLine());
        Endereco endc = new Endereco();
        endc.lerEndereco(scan);
        setEndereco(endc);
    }

    public void mostrarCampus() {
        System.out.println("\t--- caracteristicas do Campus");
        System.out.println("nome: " + getNome());
        getEndereco().mostrarEndereco();
    }
}
