import it.be.epicode.progetto.Audio;
import it.be.epicode.progetto.Immagine;
import it.be.epicode.progetto.Video;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Immagine immagine1 = new Immagine();
        Audio audio1 = new Audio();
        Video video1 = new Video();
        Immagine immagine2 = new Immagine();
        Video video2 = new Video();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita il titolo dell'immagine");
        String nome1 = scanner.next();
        immagine1.setNome(nome1);
        System.out.println("------------------------------------------------------");

        System.out.println("Digita il titolo dell'audio");
        String nome2 = scanner.next();
        audio1.setNome(nome2);
        System.out.println("Digita la durata dell'audio");
        int durata1 = scanner.nextInt();
        audio1.setDurata(durata1);
        System.out.println("------------------------------------------------------");

        System.out.println("Digita il titolo del video");
        String nome3 = scanner.next();
        video1.setNome(nome3);
        System.out.println("Digita la durata del video");
        int durata2 = scanner.nextInt();
        video1.setDurata(durata2);
        System.out.println("------------------------------------------------------");

        System.out.println("Digita il titolo dell'immagine");
        String nome4 = scanner.next();
        immagine2.setNome(nome4);
        System.out.println("------------------------------------------------------");

        System.out.println("Digita il titolo del audio");
        String nome5 = scanner.next();
        video2.setNome(nome5);
        System.out.println("Digita la durata dell'audio");
        int durata3 = scanner.nextInt();
        video2.setDurata(durata3);
        System.out.println("------------------------------------------------------");


        int play;
        do{
            System.out.println("Digita un numero tra 1 e 5 per avviare il lettore, oppure premi 0 per stoppare il lettore");
            play = scanner.nextInt();
            switch (play) {
                case 0:
                    scanner.close();
                    break;
                case 1:
                    immagine1.mostra();
                    break;
                case 2:
                    audio1.play();
                    break;
                case 3:
                    video1.play();
                    break;
                case 4:
                    immagine2.mostra();
                    break;
                case 5:
                    video2.play();
                    break;
                default:
                    System.out.println("Numero inesistente");
            }
        }while(play != 0);
    }
}


