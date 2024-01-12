package it.be.epicode.progetto;

import java.util.Scanner;

public class Video extends Riproduci implements Lumus {
    int luminosita;

    public Video() {
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        if (luminosita > 0) {
            this.luminosita = luminosita;
        } else {
            System.out.println("Devi inserire un numero superiore a 0");
        }
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;

    }
    @Override
    public void diminuisciLuminosita() {
        luminosita--;
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        int volume = 0;
        int luminosita = 0;
        System.out.println("Scegli il volume (1-10):");
        volume = scanner.nextInt();
        if (volume > 0 && volume <= 10) {
            setVolume(volume);
        } else {
            System.out.println("Volume non valido");
            System.exit(0);
        }

        System.out.println("Imposta la luminosità (1-10):");
        luminosita = scanner.nextInt();
        if (luminosita > 0 && luminosita <= 10){
            setLuminosita(luminosita);
        }else{
            System.out.println("Luminosità fuori range");
            System.exit(0);
        }

        for (int i = 0; i < durata; i++) {
            String esclamativo = "";
            for (int x = 0; x < volume; x++) {
                esclamativo += "!";
            }
            String asterisco = "";
            for (int l = 0; l < luminosita; l++) {
                asterisco += "*";
            }
            System.out.println(getNome() + " " + esclamativo + " " + asterisco);
        }
    }
}