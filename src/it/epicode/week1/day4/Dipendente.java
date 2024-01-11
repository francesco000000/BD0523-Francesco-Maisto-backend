package it.epicode.week1.day4;

public class Dipendente {
    private final double stipendioBase=1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;
    public Dipendente(String matricola,Dipartimento dipartimento){
        this.matricola=matricola;
        this.dipartimento=dipartimento;
        stipendio=stipendioBase;
        importoOrarioStraordinario=30;
        livello= Livello.OPERAIO;
    }
    public Dipendente(String matricola,double stipendio,double importoOrarioStraordinario,Livello livello,Dipartimento dipartimento){
       this.matricola=matricola;
       this.stipendio=stipendio;
       this.importoOrarioStraordinario=importoOrarioStraordinario;
       this.livello=livello;
       this.dipartimento=dipartimento;

    }

public double getStipendioBase(){
        return stipendioBase;
}
    public String getMatricola(){
        return matricola;
    }
    public double getStipendio(){
        return stipendio;
    }
    public double getImportoOrarioStraordinario(){
        return  importoOrarioStraordinario;
    }
    public Livello getLivello(){
        return livello;
    }
    public Dipartimento getDipartimento(){
        return dipartimento;
    }
    public void setDipartimento(Dipartimento dipartimento){
        this.dipartimento=dipartimento;
    }
    public void setImportoOrarioStraordinario(double importoOrarioStraordinario){
        this.importoOrarioStraordinario=importoOrarioStraordinario;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "stipendioBase=" + stipendioBase +
                ", matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public void stampaDatiDipendenti(){
        System.out.println(toString());
 }
 public Livello promuovi(){
        if (livello==Livello.OPERAIO){
            livello=Livello.IMPIEGATO;
            stipendio=stipendioBase*1.2;
            return livello;
        } else if (livello==Livello.IMPIEGATO) {
            livello=Livello.QUADRO;
            stipendio=stipendioBase*1.5;
            return livello;
        } else if (livello==Livello.QUADRO) {
            livello=Livello.DIRIGENTE;
            stipendio=stipendioBase*2;
            return livello;
        }else {

            System.out.println("Errore di promozione,il dipendente ha raggiunto la massima posizione");
            return livello;

        }

 }



 }
