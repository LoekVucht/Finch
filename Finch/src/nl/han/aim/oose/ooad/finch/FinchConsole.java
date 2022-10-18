package nl.han.aim.oose.ooad.finch;

import java.util.Scanner;

public class FinchConsole {
    public static void main(String[] args) {
        FinchSpel spel = new FinchSpel();
        Scanner scanner = new Scanner(System.in);
        registreerGebruiker(spel, scanner);
        speelQuiz(spel, scanner);
        scanner.close();
    }

    private static void speelQuiz(FinchSpel spel, Scanner scanner) {
        while (true) {
            System.out.println("Voer een S in als je een quiz wilt spelen.");
            String invoer = scanner.nextLine();
            if (invoer.equals("S")) {
                spel.spelenQuiz();
                break;
            }
        }
    }

    private static void registreerGebruiker(FinchSpel spel, Scanner scanner) {
        spel.voerGebruikersnaamIn();
        boolean gebruikersnaamBestaat = true;
        String gebruikersnaam = null;
        while (gebruikersnaamBestaat) {
            gebruikersnaam = scanner.nextLine();
            gebruikersnaamBestaat = spel.gebruikersnaamBestaat(gebruikersnaam);
        }
        spel.voerWachtwoordIn();
        String wachtwoord = scanner.nextLine();
        spel.registreer(gebruikersnaam, wachtwoord);
    }
}
