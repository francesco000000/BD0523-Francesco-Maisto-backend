package it.epicode.week1.day5;

import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] lista= new ElementoMultimediale[5];
        System.out.println("Inserisci 5 file Multimediali alla lista");
        for(int i=0; i<lista.length; i++){
            System.out.println("seleziona il tipo di file :Inserisci 1 per Audio, 2 per Video e 3 per Immagine ");
            int tipoDato = scanner.nextInt();
            scanner.nextLine();
            switch (tipoDato) {
                case 1:


                    System.out.println("titolo: (Inserisci un numero intero per assegnare un titolo al file)");
                    String titolo = scanner.nextLine();
                    System.out.println("durata: (Inserisci un numero intero per assegnare la durata)");
                    int durata = scanner.nextInt();
                    System.out.println("Volume: (Inserisci un numero intero per assegnare un valore al volume di partenza)");
                    int volume = scanner.nextInt();
                    lista[i] = new Audio(titolo,durata,volume);
                    break;
                case 2:


                    System.out.println("titolo: (Inserisci un numero intero per assegnare un titolo al file)");
                    String titoloVideo = scanner.nextLine();
                    System.out.println("durata: (Inserisci un numero intero per assegnare la durata)");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Volume: (Inserisci un numero intero per assegnare un valore al volume di partenza)");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("luminosita: (Inserisci un numero intero per assegnare la durata)");
                    int luminosita = scanner.nextInt();
                    lista[i] = new Video(titoloVideo,volumeVideo,durataVideo,luminosita);
                    break;
                case 3:
                    System.out.println("titolo: (Inserisci il titolo )");
                    String immagineTitolo = scanner.nextLine();

                    System.out.println("Luminosita: (Inserisci un numero intero per assegnare un valore alla luminosità di partenza)");
                    int immagineLuminosita = scanner.nextInt();
                    scanner.nextLine();
                    lista[i] = new Immagini(immagineTitolo, immagineLuminosita);
                    break;
                default:
                    System.out.println("Tipo di elemento non valido. Riprova.");

                    break;
            }


        }
        for(int i=0; i<lista.length; i++){
            System.out.println(lista[i]);


        }
        int scelta;
        do {
            System.out.println("Scegli quale elemento eseguire (Inserisci un numero da 1 a 5 per selezionare l'elemento da riprodurre, 0 per terminare): ");
            scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elementoScelto = lista[scelta - 1];

                if (elementoScelto instanceof Immagini) {
                    ((Immagini) elementoScelto).show();
                } else if (elementoScelto instanceof Riproduzione) {
                    ((Riproduzione) elementoScelto).play();
                } else {
                    System.out.println("Tipo di elemento non riconosciuto.");
                }
            }
        } while (scelta != 0);

        System.out.println("Programma terminato.");
    }
}


