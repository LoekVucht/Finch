package nl.han.aim.oose.ooad.finch;

import java.util.Scanner;

public class Finch {
    public static void main(String[] args) {
        // Test voor hoe we de invoer kunnen regelen
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebruikersnaam is " + krijgGebruikersnaamVanInvoer(scanner));
        System.out.println("Wachtwoord is " + krijgWachtwoordVanInvoer(scanner));
        scanner.close();
    }

    private static String krijgWachtwoordVanInvoer(Scanner scanner) {
        String wachtwoord;
        while (true) {
            System.out.println("Voer een wachtwoord in.");
            wachtwoord = scanner.nextLine();
            if (wachtwoord.length() != 0) {
                break;
            }
        }
        return wachtwoord;
    }

    private static String krijgGebruikersnaamVanInvoer(Scanner scanner) {
        String gebruikersnaam;
        while (true) {
            System.out.println("Voer een gebruikersnaam in.");
            gebruikersnaam = scanner.nextLine();
            if (gebruikersnaam.equals("bestaat al")) {
                System.out.println("Deze gebruikersnaam bestaat al.");
                continue;
            }
            if (gebruikersnaam.length() != 0) {
                break;
            }
        }
        return gebruikersnaam;
    }
}
