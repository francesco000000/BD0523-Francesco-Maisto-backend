package it.epicode.week1.day4;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente a = new Dipendente("123",Dipartimento.PRODUZIONE);
        Dipendente b =new Dipendente("2345",Dipartimento.VENDITE);
        Dipendente c = new Dipendente("367",Dipartimento.AMMINISTRAZIONE);
        Dipendente d = new Dipendente("457",Dipartimento.PRODUZIONE);
        a.promuovi();
        b.promuovi();
        b.promuovi();
        Dipendente[] lista = new Dipendente[4];
        lista[0]=a;
        lista[1]=b;
        lista[2]=c;
        lista[3]=d;
        for (int i = 0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
}
