package com.mycompany.poosobrecargametodo;
/*
A sobrecarga de métodos, também conhecida como overloading, ocorre quando criamos dois ou mais métodos com o mesmo 
nome mas com uma lista de argumentos diferente ou mesmo número de argumentos, porém variando
os tipos desses argumentos.
Pode ser aplicado em métodos construtores.

Para que seja permitida a sobrecarga, os nomes dos métodos devem ser iguais, porém, as assinaturas  diferentes.
Duas assinaturas idênticas não são permitidas.

A assinatura de um método é composta por seu nome e pelo número e tipos de argumentos que
são passados para esse método, independentemente dos nomes das variáveis
usadas na declaração do método.
*/

public class Calculadora {
    
    public double somar (double a, double b){
    /* Nome do método: somar
    Assinatura do método: public double somar (double a, double b)
    */
        return a + b;
    /*
    O tipo de retorno do método não é considerado parte da assinatura. Sendo assim, não podemos ter dois métodos
    com o mesmo nome e com o mesmo número e tipos de argumentos, mas apenas com o tipo de retorno diferente.
    */
    }
    
    public int somar (int a, int b){
        return a + b;
    }
    
    public int somar (int a, int b, int c){
        return a + b + c;
    }
    
    public int somar (int[] numeros){ 
        int total=0;
        for (int i=0; i<numeros.length;i++)
         total += numeros[i];   
        return total;
    }
    
}
