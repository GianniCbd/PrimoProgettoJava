package it.be.epicode.progetto;

import java.util.Scanner;

public class Immagine extends ElementoMultimediale {

    int luminosita;

    public Immagine() {

    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        if(luminosita > 0) {
            this.luminosita = luminosita;
        } else {
            System.out.println("Devi inserire un numero superiore a 0");
        }
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    public void mostra() {
        Scanner scanner = new Scanner(System.in);
        int luminosita = 0;

        System.out.println("Imposta la luminosità (1-10):");
        luminosita = scanner.nextInt();
        if (luminosita > 0 && luminosita <= 10) {
            setLuminosita(luminosita);
        } else {
            System.out.println("Luminosità non valida");
            System.exit(0);

        }
        String asterisco = "";
        for (int l = 0; l < luminosita; l++) {
            asterisco += "*";
        }
        System.out.println(getNome() + " " + asterisco);

    }

}
