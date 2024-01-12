package it.be.epicode.progetto;

import java.util.Scanner;

public class Audio extends Riproduci {

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        int volume = 0;
        System.out.println("Scegli il volume (1-10):");
        volume = scanner.nextInt();
        if (volume > 0 && volume <= 10) {
            setVolume(volume);
        } else {
            System.out.println("Volume non valido");

        }

        for (int i = 0; i < getDurata(); i++) {
            String esclamativo = "";
            for (int x = 0; x < volume; x++) {
                esclamativo += "!";
            }
            System.out.println(getNome() + " " + esclamativo);
        }
    }
}



