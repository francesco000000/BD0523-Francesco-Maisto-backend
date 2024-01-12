package it.epicode.week1.day5;

public class Video extends ElementoMultimediale implements Riproduzione {
    public String titolo;
    public int volume;
    public int durata;
    public int luminosita;
    public Video(String titolo,int durata,int volume,int luminosita){
        this.titolo=titolo;
        this.volume=volume;
        this.durata=durata;
        this.luminosita=luminosita;
    }


    @Override
    public void play() {
        for (int i =0;i<durata;i++){

            for (int j=0;j<volume;j++){
                System.out.print("!");
            }
            for (int j=0;j<luminosita;j++){
                System.out.print("*");
            }
            System.out.println(titolo);
        }
    }

    @Override
    public int alzaVolume(int volume) {
        this.volume+=volume;
        return this.volume;
    }

    @Override
    public int abbassaVolume(int volume) {
        this.volume-=volume;
        return this.volume;
    }
    public int abbassaluminosita(int luminosita) {
        this.luminosita+=luminosita;
        return this.luminosita;
    }
    public int alzaluminosita(int luminosita) {
        this.luminosita+=luminosita;
        return this.luminosita;
    }
    public void play(int luminosita) {
        for (int i =0;i<durata;i++){

            for (int j=0;j<volume;j++){
                System.out.print("!");
            }
            for (int j=0;j<luminosita;j++){
                System.out.print("*");
            }
            System.out.println(titolo);
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "titolo='" + titolo + '\'' +
                ", volume=" + volume +
                ", durata=" + durata +
                ", luminosita=" + luminosita +
                '}';
    }
}
