package com.mycompany.poosobrecargametodo;
public class Main {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        int[] numeros = {1,2,3,4};
        
        /*
        A decisão sobre qual método será chamado quando existirem dois ou mais métodos com o mesmo nome
        será feita pelo compilador, que verificará se os tipos passados como argumentos casam com alguma das
        assinaturas daquele método.
        */
        System.out.println("Double: " + calc.somar(10.0, 20.0));
        System.out.println("Int com 2 parâmetros: " + calc.somar(10, 20));
        System.out.println("Int com 3 parâmetros: " + calc.somar(1,2,3));
        System.out.println("Vetor de int: " + calc.somar(numeros));
        /*
        Ao verificar se há casamento entre os argumentos passados e as assinaturas dos métodos, o compilador 
        considera todas as possibilidades de conversões implícitas.
        Sendo assim, se o valor do argumento passado for, por exemplo, do tipo char e o argumento
        declarado na assinatura do método é do tipo int, então, esse valor passado será aceito, pois é
        possível fazer uma conversão implícita de char para int.
        */
        System.out.println("Char com parâmetro de int: " + calc.somar('A','B','C')); //Veja tabela ASCII para compreender o resultado: https://web.fe.up.pt/~ee96100/projecto/Tabela%20ascii.htm
        
        /*
        As conversões implícitas válidas entre os tipos primitivos do Java estão disponíveis em material complementar, 
        base dos comentários do código. 
        
        https://pt.slideshare.net/ludimila_monjardim/poo-19sobrecarga-sobreposio?from_action=save
        */
    }
    
}
