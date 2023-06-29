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
        voegVragenlijstenToe(finchShop.getBasisVragenlijsten());
    }

    public List<Vragenlijst> getVragenlijsten() {
        return vragenlijsten;
    }

    public void geefMunten(int aantalMunten) {
        saldo += aantalMunten;
    }

    public Vragenlijst doeQuiz(String onderwerp) {
        Vragenlijst vragenlijst = getVragenlijst(onderwerp);
        quiz = new Quiz(vragenlijst);
        quiz.start();
        return vragenlijst;
    }

    private Vragenlijst getVragenlijst(String onderwerp) {
        for (Vragenlijst vragenlijst : vragenlijsten) {
            if (vragenlijst.krijgOnderwerp().equalsIgnoreCase(onderwerp)) {
                return vragenlijst;
            }
        }
        return null;
    }

    private void voegVragenlijstenToe(List<Vragenlijst> vragenlijsten) {
        for (Vragenlijst vragenlijst : vragenlijsten) {
            this.vragenlijsten.add(vragenlijst);
        }
    }

    public int eindigQuiz(List<String> antwoorden, Speler speler) {
        return getQuiz().eindigQuiz(speler, antwoorden);
    }

    public Quiz getQuiz() {
        return quiz;
    }
}
