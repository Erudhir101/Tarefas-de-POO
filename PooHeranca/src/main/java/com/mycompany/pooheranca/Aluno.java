
package com.mycompany.pooheranca;

//Subclasse

import java.util.List;

public class Aluno extends Pessoa {
    
    private Curso curso;
    private List<Double> notas;

   public Aluno (){
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
    public void imprimir(){
        System.out.println("---------- DADOS DO ALUNO ----------");
        super.imprimir();
        getCurso().imprimirCurso();
        System.out.println("Notas");
        for(int x=0; x<getNotas().size();x++){
            System.out.println(getNotas().get(x).toString());
        }   
        
    }
    
}