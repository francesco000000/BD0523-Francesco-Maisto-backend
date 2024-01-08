package it.epicode.week1.day1;

import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci la base");
        double base =scan.nextDouble();
        System.out.println("inserisci l'altezza");
        double altezza =scan.nextDouble();
        double perimetro = perimetroRettangolo(base,altezza);
        System.out.println("il perimentro è:" + perimetro);
        System.out.println( pariDispari(13));
        System.out.println("l'area del triangolo è:" + areaTriangolo(2.9,3.7));

    }
    public static double perimetroRettangolo (double base,double altezza){
        return (base + altezza) * 2;

    }
    public static int pariDispari (int numero) {
        if (numero % 2 == 0) {
            return 0;
        }
         else {
            return 1;
        }
   }
    public static double areaTriangolo (double base,double altezza){
        return (base * altezza) / 2;

    }
}
