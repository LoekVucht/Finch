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


    public void registreer(String gebruikersnaam, String wachtwoord) {
        ingelogdeGebruiker = new Speler(gebruikersnaam, wachtwoord);
    }

    public void spelenQuiz() {
        if (ingelogdeGebruiker instanceof Speler) {
            ((Speler) ingelogdeGebruiker).toonVragenlijsten();
        }
    }

    public void kiesVragenlijst(String vragenlijstNaam) {
        if (ingelogdeGebruiker instanceof Speler) {
            ((Speler) ingelogdeGebruiker).doeQuiz(vragenlijstNaam);
        }
    }

    public void berekenScore() {
        if (ingelogdeGebruiker instanceof Speler) {
            ((Speler) ingelogdeGebruiker).berekenScore();
        }
    }

    public void beantwoordVraag(String antwoord) {
        if (ingelogdeGebruiker instanceof Speler) {
            ((Speler) ingelogdeGebruiker).beantwoordVraag(antwoord);
        }
    }

    public void toonVraag(String onderwerp, int vraagIndex) {
        if (ingelogdeGebruiker instanceof Speler) {
            ((Speler) ingelogdeGebruiker).toonVraag(onderwerp, vraagIndex);
        }
    }

    public boolean vragenlijstBestaat(String onderwerp) {
        if (ingelogdeGebruiker instanceof Speler) {
            return ((Speler) ingelogdeGebruiker).vragenlijstBestaat(onderwerp);
        }
        return false;
    }

    public int krijgAantalSecondenVerstreken() {
        Timer timer = ((Speler) ingelogdeGebruiker).getQuiz().getTimer();
        return (int) (timer.getAantalSysteemSecondenVerstreken() - timer.getStartTijdInSeconden());
    }

    public int krijgMaximaleTijd(String onderwerp) {
        return ((Speler) ingelogdeGebruiker).getVragenlijst(onderwerp).getMaximaleTijd();
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
