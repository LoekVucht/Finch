package nl.han.aim.oose.ooad.finch;

import java.util.Scanner;

public class FinchConsole {
    public static void main(String[] args) {
        FinchSpel spel = new FinchSpel();
        spel.voerGebruikersnaamIn();
        boolean gebruikersnaamBestaat = true;
        String gebruikersnaam = null;
        Scanner scanner = new Scanner(System.in);
        while (gebruikersnaamBestaat) {
            gebruikersnaam = scanner.nextLine();
            gebruikersnaamBestaat = spel.gebruikersnaamBestaat(gebruikersnaam);
        }
        spel.voerWachtwoordIn();
        String wachtwoord = scanner.nextLine();
        scanner.close();
        spel.registreer(gebruikersnaam, wachtwoord);
    }
}
