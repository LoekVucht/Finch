package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Gebruiker;
import nl.han.aim.oose.ooad.finch.gebruiker.Speler;

import java.util.ArrayList;
import java.util.List;

public class FinchSpel {
    private List<Gebruiker> gebruikers = new ArrayList<>();
    private List<Thema> themas = new ArrayList<>();
    private Gebruiker ingelogdeGebruiker = null;

    public FinchSpel() {
        gebruikers.add(new Speler("testGebruiker", "12345"));
    }

    public void voerGebruikersnaamIn() {
        System.out.println("Voer een gebruikersnaam in:");
    }

    public void registreer(String gebruikersnaam, String wachtwoord) {
        ingelogdeGebruiker = new Speler(gebruikersnaam, wachtwoord);
    }

    public void spelenQuiz() {
        if (ingelogdeGebruiker instanceof Speler) {
            ((Speler) ingelogdeGebruiker).toonVragenlijsten();
        }
    }

    public void kiesVragenlijst(String vragenlijstnaam) {

    }

    public void beantwoordVraag(String antwoord) {

    }

    public void berekenScore() {

    }

    public void voerWachtwoordIn() {
        System.out.println("Voer een wachtwoord in:");
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
