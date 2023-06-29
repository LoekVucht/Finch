package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Speler;
import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.List;

public class FinchSpelController {
    private FinchSpel finchSpel = new FinchSpel();

    public String registreer(String gebruikersnaam, String wachtwoord) {
        return finchSpel.registreer(gebruikersnaam, wachtwoord);
    }

    public List<Vragenlijst> spelenQuiz(String gebruikersnaam) {
        return finchSpel.spelenQuiz(gebruikersnaam);
    }

    public List<Vraag> beginQuiz(String vragenlijstNaam) {
        return finchSpel.beginQuiz(vragenlijstNaam);
    }

    public int eindigQuiz(List<String> antwoorden, String gebruikersnaam) {
        return finchSpel.eindigQuiz(antwoorden, gebruikersnaam);
    }

    public FinchSpel getFinchSpel() {
        return finchSpel;
    }
}
