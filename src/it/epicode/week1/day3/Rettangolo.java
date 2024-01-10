package it.epicode.week1.day3;

public class Rettangolo {
    private double altezza;
    private double larghezza;
    public Rettangolo(double altezza,double larghezza){
        this.altezza=altezza;
        this.larghezza=larghezza;
    }
    public double calcoloPerimetro(){
        return (altezza+larghezza)*2;
    }
    public double calcoloArea(){
        return altezza*larghezza;
    }

}
