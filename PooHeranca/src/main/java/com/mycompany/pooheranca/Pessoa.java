package com.mycompany.pooheranca;
//SuperClasse
import java.util.List;
public class Pessoa {
    private String nome;
    private String email;
    private String cpf;
    private Endereco endereco;
    private List<Telefone> telefones; //Declaração de uma lista de telefones
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void imprimir(){
        System.out.println("Nome:"+ getNome());
        System.out.println("Email:"+ getEmail());
        System.out.println("CPF:"+ getCpf());
        
        getEndereco().imprimirEndereco();
       
        for(int x=0; x<getTelefones().size();x++){ //método size(), que retorna o tamanho da lista
            getTelefones().get(x).imprimirTelefone(); //método get() para manipulação dos índices da lista
        }          
}
}