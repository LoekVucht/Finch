package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Medewerker;
import nl.han.aim.oose.ooad.finch.vraag.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinchConsole {
    public static void main(String[] args) {
        setup();
        FinchSpelController finchSpelController = new FinchSpelController();
        Scanner scanner = new Scanner(System.in);
        registreerGebruiker(finchSpelController, scanner);
        speelQuiz(finchSpelController, scanner);
        scanner.close();
    }

    private static void speelQuiz(FinchSpelController spelController, Scanner scanner) {
        while (true) {
            System.out.println("Voer een S in als je een quiz wilt spelen.");
            String invoer = scanner.nextLine();
            if (invoer.equalsIgnoreCase("S")) {
                System.out.println("Je bezit de volgende vragenlijsten:");
                for (Vragenlijst vragenlijst : spelController.spelenQuiz()) {
                    System.out.println(vragenlijst.krijgOnderwerp());
                }
                spelController.spelenQuiz();
                break;
            }
        }
        while (true) {
            System.out.println("Voer een vragenlijst in:");
            String vragenlijstInvoer = scanner.nextLine();

            try {
                Vragenlijst vragenlijst = spelController.beginQuiz(vragenlijstInvoer);
                System.out.println("Deze vragenlijst bestaat niet");
                List<String> antwoorden = new ArrayList<>();
                for (int gespeeldeVragen = 0; gespeeldeVragen < 10; gespeeldeVragen++) {
                    System.out.println(vragenlijst.krijgVraag(gespeeldeVragen).getVraag());
                    if (vragenlijst.krijgVraag(gespeeldeVragen) instanceof Meerkeuzevraag) {
                        for (Antwoordoptie antwoordOptie : ((Meerkeuzevraag) vragenlijst.krijgVraag(gespeeldeVragen)).getAntwoordopties()) {
                            System.out.println(antwoordOptie.getAntwoord());
                        }
                    }
                    String antwoordInvoer = scanner.nextLine();
                    antwoorden.add(antwoordInvoer);
                }
                System.out.println("Score: " + spelController.eindigQuiz(antwoorden, spelController.getFinchSpel().getSpeler()));
                break;
            } catch (NullPointerException e) {
                System.out.println("Deze vragenlijst bestaat niet.");
            }
        }
    }

    private static void registreerGebruiker(FinchSpelController spelController, Scanner scanner) {
        while (true) {
            System.out.println("Voer een gebruikersnaam in:");
            String gebruikersnaam = scanner.nextLine();
            System.out.println("Voer een wachtwoord in:");
            String wachtwoord = scanner.nextLine();
            if (spelController.registreer(gebruikersnaam, wachtwoord) == "niet succesvol") {
                System.out.println("Deze gebruikersnaam bestaat al.");
            }
            else if (spelController.registreer(gebruikersnaam, wachtwoord) == "succesvol") {
                System.out.println("Je hebt een account aangemaakt!");
                break;
            }
        }
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
        vraag3.voegAntwoordToe(new Antwoordoptie("volleybal", false));
        medewerker.voegVraagToe(vraag3);

        OpenVraag vraag4 = new OpenVraag("In welk land werd het WK in 2022 gehouden?");
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