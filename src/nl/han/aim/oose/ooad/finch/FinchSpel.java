package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Gebruiker;
import nl.han.aim.oose.ooad.finch.gebruiker.Speler;
import nl.han.aim.oose.ooad.finch.vraag.Vraag;

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

    public List<Vragenlijst> spelenQuiz(String gebruikersnaam) {
        return getGebruiker(gebruikersnaam).getVragenlijsten();
   }

    public List<Vraag> beginQuiz(String vragenlijstNaam) {
        return speler.beginQuiz(vragenlijstNaam);
    }

    public int eindigQuiz(List<String> antwoorden, String gebruikersnaam) {
        speler = getGebruiker(gebruikersnaam);
        return speler.eindigQuiz(antwoorden, speler);
    }

    private boolean gebruikersnaamBestaat(String gebruikersnaam) {
        for (Gebruiker gebruiker : gebruikers) {
            if (gebruiker.getGebruikersnaam().equals(gebruikersnaam)) {
                return true;
            }
        }
        return false;
    }
    public Speler getGebruiker(String gebruikersnaam) {
        for (Gebruiker gebruiker: gebruikers){
            gebruiker.getGebruikersnaam().equals(gebruikersnaam);
        }

        return speler;
    }
}
