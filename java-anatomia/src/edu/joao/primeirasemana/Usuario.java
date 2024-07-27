package edu.joao.primeirasemana;

import java.util.Scanner;

public class Usuario {
    
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();
         System.out.println("TV Ligada: " + smartTV.ligada);
         System.out.println("Qual o Canal: " + smartTV.canal);
         System.out.println("Qual o Volume: " + smartTV.volume);

         smartTV.ligar();
         smartTV.aumentarVolume();
         smartTV.trocarCanal();
        
         System.out.println("TV Ligada? " + smartTV.ligada);
         System.out.println(smartTV.volume);
         System.out.println(smartTV.canal);

         smartTV.subirCanal();
         System.out.println(smartTV.canal);
    }
}
