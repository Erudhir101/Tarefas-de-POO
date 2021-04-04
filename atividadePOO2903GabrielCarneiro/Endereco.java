package com.mycompany.atividade2903.atividadePOO2903GabrielCarneiro;

import java.util.Scanner;

public class Endereco {

    private String rua;
    private String cep;
    private String cidade;
    private String estado;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void lerEndereco(Scanner scan) {
        System.out.println("----------- Cadastro de Endereco -------------");
        System.out.println("Digite o nome da rua:");
        setRua(scan.nextLine());
        System.out.println("Digite o nome do CEP:");
        setCep(scan.nextLine());
        System.out.println("Digite o nome da cidade:");
        setCidade(scan.nextLine());
        System.out.println("Digite o nome do estado:");
        setEstado(scan.nextLine());
    }

    public void mostrarEndereco() {
        System.out.println("\t--- caracteristicas do Endereco");
        System.out.println("Nome da rua: " + getRua());
        System.out.println("Nome do CEP: " + getCep());
        System.out.println("Nome da cidade: " + getCidade());
        System.out.println("Nome do estado: " + getEstado());
    }
}
