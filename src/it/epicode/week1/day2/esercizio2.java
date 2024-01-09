package it.epicode.week1.day2;

import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int numero = scan.nextInt();
        switch (numero) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
            default:
                System.out.println("errore! digita un numero da 0 a 3");


        }
    }
}