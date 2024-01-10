package it.epicode.week1.day3;

import java.util.Arrays;

public class Sim {
    private int numero;
    private double costoAlSecondo;
    private double credito;
    private String[] registroChiamate = new String[5];
    public Sim(int numero,double costoAlSecondo,double credito,String[] registroChiamate){
        this.numero=numero;
        this.costoAlSecondo=costoAlSecondo;
        this.credito=credito;
        this.registroChiamate=registroChiamate;
    }
    public int getNumero(){
        return numero;
    }
    public  double getCostoAlSecondo(){
        return costoAlSecondo;
    }
    public double getCredito(){
        return credito;
    }
    public String[] getRegistroChiamat(){
        return registroChiamate;
    }
    public double telefonata(double secondi, String numero){
        double costo= secondi*costoAlSecondo;
        credito-=costo;
       registroChiamate= new String[]{numero};
       return costo;

    }









}
