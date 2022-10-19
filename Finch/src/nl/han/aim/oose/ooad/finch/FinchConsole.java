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
                for (int gespeeldeVragen = 0; gespeeldeVragen < 10; gespeeldeVragen++) {
                    spel.toonVraag(vragenlijstInvoer, gespeeldeVragen);
                    String antwoordInvoer = scanner.nextLine();
                    spel.beantwoordVraag(gespeeldeVragen, antwoordInvoer);
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

        OpenVraag vraag2 = new OpenVraag("Waarom is voetbal zo'n grote sport?");
        vraag2.voegAntwoordToe(new Antwoord("daarom"));
        vraag2.voegAntwoordToe(new Antwoord("gewoon"));
        medewerker.voegVraagToe(vraag2);

        Meerkeuzevraag vraag3 = new Meerkeuzevraag("Waar speel je voetbal mee?");
        vraag3.voegAntwoordToe(new Antwoordoptie("basketbal", false));
        vraag3.voegAntwoordToe(new Antwoordoptie("voetbal", true));
        vraag3.voegAntwoordToe(new Antwoordoptie("skippybal", false));
        vraag3.voegAntwoordToe(new Antwoordoptie("bal", false));
        medewerker.voegVraagToe(vraag3);

        OpenVraag vraag4 = new OpenVraag("Wat is messi?");
        vraag4.voegAntwoordToe(new Antwoord("voetballer"));
        vraag4.voegAntwoordToe(new Antwoord("een voetballer"));
        medewerker.voegVraagToe(vraag4);

        OpenVraag vraag5 = new OpenVraag("waarom is voetbal zo'n grote sport");
        vraag5.voegAntwoordToe(new Antwoord("daarom"));
        vraag5.voegAntwoordToe(new Antwoord("gewoon"));
        medewerker.voegVraagToe(vraag5);

        Meerkeuzevraag vraag6 = new Meerkeuzevraag("waar speel je voetbal mee?");
        vraag6.voegAntwoordToe(new Antwoordoptie("basketbal", false));
        vraag6.voegAntwoordToe(new Antwoordoptie("voetbal", true));
        vraag6.voegAntwoordToe(new Antwoordoptie("skippybal", false));
        vraag6.voegAntwoordToe(new Antwoordoptie("bal", false));
        medewerker.voegVraagToe(vraag6);

        Meerkeuzevraag vraag7 = new Meerkeuzevraag("waar speel je voetbal mee?");
        vraag7.voegAntwoordToe(new Antwoordoptie("basketbal", false));
        vraag7.voegAntwoordToe(new Antwoordoptie("voetbal", true));
        vraag7.voegAntwoordToe(new Antwoordoptie("skippybal", false));
        vraag7.voegAntwoordToe(new Antwoordoptie("bal", false));
        medewerker.voegVraagToe(vraag7);

        OpenVraag vraag8 = new OpenVraag("wat is messi");
        vraag8.voegAntwoordToe(new Antwoord("voetballer"));
        vraag8.voegAntwoordToe(new Antwoord("een voetballer"));
        medewerker.voegVraagToe(vraag8);

        OpenVraag vraag9 = new OpenVraag("waarom is voetbal zo'n grote sport");
        vraag9.voegAntwoordToe(new Antwoord("daarom"));
        vraag9.voegAntwoordToe(new Antwoord("gewoon"));
        medewerker.voegVraagToe(vraag9);

        Meerkeuzevraag vraag10 = new Meerkeuzevraag("waar speel je voetbal mee?");
        vraag10.voegAntwoordToe(new Antwoordoptie("basketbal", false));
        vraag10.voegAntwoordToe(new Antwoordoptie("voetbal", true));
        vraag10.voegAntwoordToe(new Antwoordoptie("skippybal", false));
        vraag10.voegAntwoordToe(new Antwoordoptie("bal", false));
        medewerker.voegVraagToe(vraag10);

        medewerker.voegThemaToe("sport");
        medewerker.voegVragenlijstToe("sport");
    }
}