package it.be.epicode.progetto;


public abstract class Riproduci extends ElementoMultimediale {

    public int durata;
    public int volume;

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setDurata(int durata) {
        if (durata > 0) {
            this.durata = durata;
        } else {
            System.out.println("Inserisci un valore maggiore a 0");
        }
    }

    public void setVolume(int volume) {
        if (volume > 0) {
            this.volume = volume;
        } else {
            System.out.println("Aumenta il livello del volume");
        }
    }

    public int abbassaVolume() {
        this.volume -= volume;
        return this.volume;
    }

    public int aumentaVolume() {
        this.volume += volume;
        return this.volume;
    }

    public void play() {
        for (int i = 0; i < durata; i++) {
            String esclamativo = "";
            for (int x = 0; x < volume; x++) {
                esclamativo += "!";
            }
            System.out.println(getNome() + " " + esclamativo);
        }
    }

}
