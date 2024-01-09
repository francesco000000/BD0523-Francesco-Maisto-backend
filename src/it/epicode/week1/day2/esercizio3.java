package it.epicode.week1.day2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase;

       while (true){
           System.out.println("Inserisci una frase :");
           frase = scan.nextLine();
           char [] singoli= Arrays.toString(frase.split("")).toCharArray();
           System.out.println(singoli);
           if (Objects.equals(frase, "q")) {
               System.out.println("Hai inserito 'q'. Uscita dal programma.");
               break;
           }
       }
    }


        }




