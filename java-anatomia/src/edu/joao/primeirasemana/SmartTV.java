package edu.joao.primeirasemana;

import java.util.Scanner;

public class SmartTV {
    
    Scanner scan = new Scanner(System.in);
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }

    public void subirCanal(){
        canal++;
        if (canal == 31) {
            canal = 1;
        }
    }
    public void diminuirCanal(){
        canal--;
        if (canal == 0) {
            canal = 30;
        }
    }
    public void trocarCanal() {
        canal = scan.nextInt();
    }
}
