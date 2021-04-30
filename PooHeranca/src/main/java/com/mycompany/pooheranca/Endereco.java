package com.mycompany.pooheranca;

import java.util.Scanner;

public class Endereco {
    private String rua;
    private String cidade;
    private String estado;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
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

    public void imprimirEndereco() {
        System.out.println("Endereço: Rua " + getRua() + ". " + getCidade() + " - " + getEstado());
    }

    public void cadastrarEndereco(Scanner scan) {
        System.out.println("---------- CADASTRO DE ENDEREÇO ----------");
        System.out.print("Digite a rua: ");
        this.setRua(scan.next());
        Main.limparBuffer(scan);
        System.out.print("Digite a cidade: ");
        this.setCidade(scan.next());
        Main.limparBuffer(scan);
        System.out.print("Digite o estado: ");
        this.setEstado(scan.next());
        Main.limparBuffer(scan);
        System.out.println("\n");
    }
}
