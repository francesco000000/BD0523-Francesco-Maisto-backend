package it.epicode.week1.day5;

public class Audio extends ElementoMultimediale implements Riproduzione {
public String titolo;
public int volume;
public int durata;
public Audio(String titolo,int durata,int volume){
    this.titolo=titolo;
    this.volume=volume;
    this.durata=durata;
}
    @Override
    public void play() {
        for (int i =0;i<durata;i++){

            for (int j=0;j<volume;j++){
                System.out.print("!");
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
        this.volume+=volume;
        return this.volume;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "titolo='" + titolo + '\'' +
                ", volume=" + volume +
                ", durata=" + durata +
                '}';
    }
}










