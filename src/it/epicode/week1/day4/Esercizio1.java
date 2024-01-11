package it.epicode.week1.day4;

public class Esercizio1 {
    public static void main(String[] args) {
        Dipendente x = new Dipendente("000",Dipartimento.PRODUZIONE);
         x.stampaDatiDipendenti();
         x.promuovi();
         x.stampaDatiDipendenti();
        System.out.println(" stipendio mensile: "+calcolaPaga(x));
        System.out.println("stipendio mensile compreso di straordinario : "+calcolaPaga(x,2));


    }
public static double calcolaPaga(Dipendente x){
    return x.getStipendio();
}
public static double calcolaPaga(Dipendente x,int ore){
      return x.getStipendio()+(ore*x.getImportoOrarioStraordinario());
}
}
