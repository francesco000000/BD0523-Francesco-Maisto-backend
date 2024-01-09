package it.epicode.week1.day2;

import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci una frase");
        String frase= scan.next();
        boolean x= stringaPariDispari(frase);
        if (x){
            System.out.println("la parola è pari");
        }else {
            System.out.println("la parola è dispari");
        }

        System.out.println("inserisci l'anno");
        int anno = scan.nextInt();
        System.out.println(annoBisestile(anno));
    }
    public static boolean stringaPariDispari(String frase){
       if (frase.length()%2==0){
           return true;
       }else {
        return false;
    }
}
    public static boolean annoBisestile(int anno){
        if (anno % 4 == 0){
            return true;
        }else {
            return false;
        }
    }
}
