package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Gebruiker;
import nl.han.aim.oose.ooad.finch.gebruiker.Speler;

import java.util.ArrayList;
import java.util.List;

public class FinchSpel {
    private List<Gebruiker> gebruikers = new ArrayList<>();

    private List<Thema> themas = new ArrayList<>();
    private Speler speler = null;

    public FinchSpel() {
        gebruikers.add(new Speler("testGebruiker", "12345"));
    }


    public String registreer(String gebruikersnaam, String wachtwoord) {
        if (gebruikersnaamBestaat(gebruikersnaam)) {
            return "niet succesvol";
        }
        else {
            speler = new Speler(gebruikersnaam, wachtwoord);
            return "succesvol";
        }
    }

    public List<Vragenlijst> spelenQuiz() {
        return getSpeler().getVragenlijsten();
   }

    public Vragenlijst beginQuiz(String vragenlijstNaam) {
        return speler.doeQuiz(vragenlijstNaam);
    }

    public int eindigQuiz(List<String> antwoorden, Speler speler) {
        return speler.eindigQuiz(antwoorden, speler);
    }

    public boolean vragenlijstBestaat(String onderwerp) {
            return speler.vragenlijstBestaat(onderwerp);
    }

    private boolean gebruikersnaamBestaat(String gebruikersnaam) {
        for (Gebruiker gebruiker : gebruikers) {
            if (gebruiker.getGebruikersnaam().equals(gebruikersnaam)) {
                return true;
            }
        }
        return false;
    }
    public Speler getSpeler() {
        return speler;
    }
}
