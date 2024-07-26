package edu.joao.primeirasemana;

public class OperadorTernario {
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 6;

        String resultado = "";

        if (a==b) 
            resultado = "verdadeiro";
        else 
        resultado = "falso";
        
        System.out.println(resultado);

        //Uma maneira diferente de se fazer esta mesma operação, chama de Operação Ternária, é da seguinte forma:

        String resultado2 = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado2);
        
    }
}
