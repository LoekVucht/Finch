package nl.han.aim.oose.ooad.finch.gebruiker;

import nl.han.aim.oose.ooad.finch.FinchShop;
import nl.han.aim.oose.ooad.finch.Quiz;
import nl.han.aim.oose.ooad.finch.Vragenlijst;

import java.util.ArrayList;
import java.util.List;

public class Speler extends Gebruiker {
    private double saldo;
    private Quiz quiz;
    private List<Vragenlijst> vragenlijsten = new ArrayList<>();
    private FinchShop finchShop;

    public Speler(String gebruikersnaam, String wachtwoord) {
        super(gebruikersnaam, wachtwoord);
        finchShop = new FinchShop(this);
        geefMunten(100);
        vragenlijsten.add(finchShop.krijgVragenlijst("Voetbal"));
    }

    public void toonVragenlijsten() {
        System.out.println("Je bezit de volgende vragenlijsten:");
        for (Vragenlijst vragenlijst : vragenlijsten) {
            System.out.println(vragenlijst.krijgOnderwerp());
        }
    }

    public void geefMunten(int aantalMunten) {
        saldo += aantalMunten;
    }

    public void doeQuiz(String vragenlijstNaam) {
        Vragenlijst vragenlijst = getVragenlijst(vragenlijstNaam);
        quiz = new Quiz(vragenlijst);
    }

    public boolean vragenlijstBestaat(String onderwerp) {
        return getVragenlijst(onderwerp) != null;
    }

    public Vragenlijst getVragenlijst(String onderwerp) {
        for (Vragenlijst vragenlijst : vragenlijsten) {
            if (vragenlijst.krijgOnderwerp().equalsIgnoreCase(onderwerp)) {
                return vragenlijst;
            }
        }
        return null;
    }

    public void toonVraag(String onderwerp, int vraagIndex) {
        quiz.getQuizvragen().get(vraagIndex).toonVraag();
    }

    public void beantwoordVraag(String antwoord) {
        quiz.beantwoordVraag(antwoord);
    }

    public void berekenScore() {
        quiz.berekenScore(this);
    }

    public Quiz getQuiz() {
        return quiz;
    }
}
