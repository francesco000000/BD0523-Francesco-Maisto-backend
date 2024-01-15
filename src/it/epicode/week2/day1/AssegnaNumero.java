package it.epicode.week2.day1;

import java.util.Scanner;

public class AssegnaNumero  {
    public static void assegna()throws AssegnaNumeroException{

        Scanner scan = new Scanner(System.in);
        int[] numeri = {1,2,3,4,5};
        for (int i =0;i<numeri.length;i++){
            System.out.println(numeri[i]);
        }
        System.out.println("scrivi un numero e scegli la posizione da 0 a 4 , con 0 esci dal programma");
        int numero ;
        do {
            System.out.println("dammi il numero");
            numero = scan.nextInt();
            if (numero==0){
                continue;
            }else  {
                System.out.println("dammi la posizione");
                int posizione=scan.nextInt();

                numeri[posizione]=numero;
                for (int i =0;i<numeri.length;i++){
                    System.out.println(numeri[i]);
                }
            }
        } while (numero!= 0);
        System.out.println("uscito dal programma");
    }
}
