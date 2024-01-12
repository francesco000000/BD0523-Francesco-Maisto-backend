package it.epicode.week1.day5;

public class Immagini extends ElementoMultimediale {
public String titolo;
public int luminosita;
    public Immagini(String titolo,int luminosita) {

        this.titolo=titolo;
        this.luminosita=luminosita;
    }
    public void show(){
        for (int i =0;i<luminosita;i++){

            for (int j=0;j<luminosita;j++){
                System.out.print("*");
            }
            System.out.println(titolo);
        }

    }


    public int alzaluminosita(int luminosita) {
        this.luminosita+=luminosita;
        return this.luminosita;
    }

    public int abbassaluminosita(int luminosita) {
        this.luminosita-=luminosita;
        return this.luminosita;
    }

    @Override
    public String toString() {
        return "Immagini{" +
                "titolo='" + titolo + '\'' +
                ", luminosita=" + luminosita +
                '}';
    }
}
