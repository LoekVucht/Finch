package nl.han.aim.oose.ooad.finch;

import java.util.Scanner;

public class FinchSpel {
    private Gebruiker[] gebruikers;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welkom bij Finch! Typ \"R\" om je te registreren of \"I\" om in te loggen met een bestaand account.");
        while (true) {
            String keuze = krijgInvoer();
            if (keuze.equals("R")) {
                registreer(scanner);
                break;
            } else if (keuze.equals("I")) {
                System.out.println("inloggen");
                // todo
                break;
            } else {
                System.out.println("Typ \"R\" of \"I\".");
            }
        }
        scanner.close();
    }

    private static String krijgInvoer() {
        return scanner.nextLine();
    }

    private static void registreer(Scanner scanner) {
        System.out.println("Gebruikersnaam is " + krijgGebruikersnaamVanInvoer(scanner));
        System.out.println("Wachtwoord is " + krijgWachtwoordVanInvoer(scanner));
    }

    private static String krijgWachtwoordVanInvoer(Scanner scanner) {
        String wachtwoord;
        while (true) {
            System.out.println("Voer een wachtwoord in.");
            wachtwoord = krijgInvoer();
            if (!wachtwoord.isBlank()) {
                break;
            }
        }
        return wachtwoord;
    }

    private static String krijgGebruikersnaamVanInvoer(Scanner scanner) {
        String gebruikersnaam;
        while (true) {
            System.out.println("Voer een gebruikersnaam in.");
            gebruikersnaam = krijgInvoer();
            if (gebruikersnaam.equals("bestaat al")) {
                System.out.println("Deze gebruikersnaam bestaat al.");
                continue;
            }
            if (!gebruikersnaam.isBlank()) {
                break;
            }
        }
        return gebruikersnaam;
    }
}
