package it.epicode.week1.day3;

public class esercizio1 {
    public static void main(String[] args) {
        Rettangolo r1= new Rettangolo(6,3);
        Rettangolo r2 = new Rettangolo(4,5);
        stampaRettangolo(r1);
    }
public static void stampaRettangolo(Rettangolo r){
    System.out.println("il perimetro  del rettangolo è : "+r.calcoloPerimetro());
    System.out.println("l'area del rettangolo è : "+r.calcoloArea());

}
}
