package it.epicode.week1.day3;

import java.util.Arrays;

public class esercizio2 {
    public static void main(String[] args) {

        Sim sim1=new Sim(33899,0.50,10, new String[]{});

        System.out.println(sim1.telefonata(10,"4444"));
        datiSim(sim1);
    }
    public static void datiSim(Sim s){
        System.out.println("numero sim:"+s.getNumero());
        System.out.println("credito residuo:"+s.getCredito());
        System.out.println("costo chiamata al secondo:"+s.getCostoAlSecondo());
        System.out.println("registro chiamate"+Arrays.toString(s.getRegistroChiamat()));
    }
}
