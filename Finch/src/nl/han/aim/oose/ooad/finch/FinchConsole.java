package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Medewerker;
import nl.han.aim.oose.ooad.finch.vraag.*;

import java.util.Scanner;

public class FinchConsole {
    public static void main(String[] args) {
        setup();
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
            if (invoer.equalsIgnoreCase("S")) {
                spel.spelenQuiz();
                break;
            }
        }
        while (true) {
            System.out.println("Voer een vragenlijst in:");
            String vragenlijstInvoer = scanner.nextLine();
            if (!spel.vragenlijstBestaat(vragenlijstInvoer)) {
                System.out.println("Deze vragenlijst bestaat niet.");
            } else {
                spel.kiesVragenlijst(vragenlijstInvoer);
                System.out.println("Je hebt " + spel.krijgMaximaleTijd(vragenlijstInvoer) + " seconden de tijd.");
                for (int gespeeldeVragen = 0; gespeeldeVragen < 10; gespeeldeVragen++) {
                    spel.toonVraag(vragenlijstInvoer, gespeeldeVragen);
                    String antwoordInvoer = scanner.nextLine();
                    spel.beantwoordVraag(gespeeldeVragen, antwoordInvoer);
                    System.out.println("Je hebt nog " + (spel.krijgMaximaleTijd(vragenlijstInvoer) - spel.krijgAantalSecondenVerstreken())
                            + " seconden over.");
                }
                spel.berekenScore();
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


    private static void setup() {
        Medewerker medewerker = new Medewerker("setup", "setup");
        medewerker.maakNieuweVragenlijst("Voetbal", 100, 100);
        OpenVraag vraag1 = new OpenVraag("Wat is Messi?");
        vraag1.voegAntwoordToe(new Antwoord("voetballer"));
        vraag1.voegAntwoordToe(new Antwoord("een voetballer"));
        medewerker.voegVraagToe(vraag1);

        Meerkeuzevraag vraag2 = new Meerkeuzevraag("Wat is de oudste professionele voetbalclub van Nederland?");
        vraag2.voegAntwoordToe(new Antwoordoptie("Vitesse", false));
        vraag2.voegAntwoordToe(new Antwoordoptie("Sparta", true));
        vraag2.voegAntwoordToe(new Antwoordoptie("Willem II", false));
        vraag2.voegAntwoordToe(new Antwoordoptie("FC Utrecht", false));
        medewerker.voegVraagToe(vraag2);

        Meerkeuzevraag vraag3 = new Meerkeuzevraag("Waar speel je voetbal mee?");
        vraag3.voegAntwoordToe(new Antwoordoptie("basketbal", false));
        vraag3.voegAntwoordToe(new Antwoordoptie("voetbal", true));
        vraag3.voegAntwoordToe(new Antwoordoptie("skippybal", false));
        vraag3.voegAntwoordToe(new Antwoordoptie("bal", false));
        medewerker.voegVraagToe(vraag3);

        OpenVraag vraag4 = new OpenVraag("In welk land zal het WK 2022 worden gehouden?");
        vraag4.voegAntwoordToe(new Antwoord("Qatar"));
        medewerker.voegVraagToe(vraag4);

        Meerkeuzevraag vraag5 = new Meerkeuzevraag("Welk land heeft de meeste WK's gewonnen?");
        vraag5.voegAntwoordToe(new Antwoordoptie("Brazilië", true));
        vraag5.voegAntwoordToe(new Antwoordoptie("Duitsland", false));
        vraag5.voegAntwoordToe(new Antwoordoptie("Italië", false));
        vraag5.voegAntwoordToe(new Antwoordoptie("Spanje", false));
        medewerker.voegVraagToe(vraag5);

        Meerkeuzevraag vraag6 = new Meerkeuzevraag("Welke club die uit Limburg komt speelt in de Eredivisie?");
        vraag6.voegAntwoordToe(new Antwoordoptie("Fortuna Sittard", true));
        vraag6.voegAntwoordToe(new Antwoordoptie("MVV", false));
        vraag6.voegAntwoordToe(new Antwoordoptie("Roda JC", false));
        vraag6.voegAntwoordToe(new Antwoordoptie("VVV Venlo", false));
        medewerker.voegVraagToe(vraag6);

        Meerkeuzevraag vraag7 = new Meerkeuzevraag("Wat is de huidige trainer van Vitesse?");
        vraag7.voegAntwoordToe(new Antwoordoptie("Thomas Letsch", false));
        vraag7.voegAntwoordToe(new Antwoordoptie("Philip Cocu", true));
        vraag7.voegAntwoordToe(new Antwoordoptie("Edward Sturing", false));
        vraag7.voegAntwoordToe(new Antwoordoptie("Theo Janssen", false));
        medewerker.voegVraagToe(vraag7);

        OpenVraag vraag8 = new OpenVraag("Wie is de recordhouder eigen doelpunten in betaald voetbal?");
        vraag8.voegAntwoordToe(new Antwoord("Sven van Beek"));
        medewerker.voegVraagToe(vraag8);

        OpenVraag vraag9 = new OpenVraag("In hoeveel WK-finales heeft Nederland gespeeld?");
        vraag9.voegAntwoordToe(new Antwoord("3"));
        vraag9.voegAntwoordToe(new Antwoord("drie"));
        medewerker.voegVraagToe(vraag9);

        Meerkeuzevraag vraag10 = new Meerkeuzevraag("Guus Hiddink zorgde ervoor dat een Gelderse plaats een bedevaartsoord werd voor Zuid-Koreanen. Welke plaats betreft dit?");
        vraag10.voegAntwoordToe(new Antwoordoptie("Doesburgh", false));
        vraag10.voegAntwoordToe(new Antwoordoptie("Groenlo", false));
        vraag10.voegAntwoordToe(new Antwoordoptie("Varsseveld", true));
        vraag10.voegAntwoordToe(new Antwoordoptie("Aalten", false));
        medewerker.voegVraagToe(vraag10);

        medewerker.voegThemaToe("sport");
        medewerker.voegVragenlijstToe("sport");
    }
}