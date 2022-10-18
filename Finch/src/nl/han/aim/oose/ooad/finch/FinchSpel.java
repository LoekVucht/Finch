package nl.han.aim.oose.ooad.finch;

import java.util.Scanner;

public class FinchSpel {
    private Gebruiker[] gebruikers = {new Gebruiker("testgebruiker", "12345")};
    private Gebruiker ingelogdeGebruiker = null;
    private Scanner scanner = new Scanner(System.in);
    private Thema[] themas = {new Thema("Sport")};

    public void voerGebruikersnaamIn() {
        System.out.println("Voer een gebruikersnaam in:");
    }

    public void registreer(String gebruikersnaam, String wachtwoord) {
        ingelogdeGebruiker = new Gebruiker(gebruikersnaam, wachtwoord);
    }

    public void spelenQuiz() {

    }

    public void kiesVragenlijst(String vragenlijstnaam) {

    }

    public void beantwoordVraag(String antwoord) {

    }

    public void berekenScore() {

    }

    public void voerWachtwoordIn() {
        System.out.println("Voer een wachtwoord in");
    }

    public boolean gebruikersnaamBestaat(String gebruikersnaam) {
        return getGebruiker(gebruikersnaam) != null;
    }

    public Gebruiker getGebruiker(String gebruikersnaam) {
        for (Gebruiker gebruiker : gebruikers) {
            if (gebruiker.getGebruikersnaam().equals(gebruikersnaam)) {
                return gebruiker;
            }
        }
        return null;
    }

    public void setIngelogdeGebruiker(Gebruiker ingelogdeGebruiker) {
        this.ingelogdeGebruiker = ingelogdeGebruiker;
    }

    public Gebruiker getIngelogdeGebruiker() {
        return ingelogdeGebruiker;
    }
}
