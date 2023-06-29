package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Speler;

import java.util.List;

public class FinchSpelController {
    private FinchSpel finchSpel = new FinchSpel();

    public String registreer(String gebruikersnaam, String wachtwoord) {
        return finchSpel.registreer(gebruikersnaam, wachtwoord);
    }

    public List<Vragenlijst> spelenQuiz() {
        return finchSpel.spelenQuiz();
    }

    public Vragenlijst beginQuiz(String vragenlijstNaam) {
        return finchSpel.beginQuiz(vragenlijstNaam);
    }

    public boolean vragenlijstBestaat(String onderwerp) {
        return finchSpel.vragenlijstBestaat(onderwerp);
    }

    public int eindigQuiz(List<String> antwoorden, Speler speler) {
        return finchSpel.eindigQuiz(antwoorden, speler);
    }

    public FinchSpel getFinchSpel() {
        return finchSpel;
    }
}
