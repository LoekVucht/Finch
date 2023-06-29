package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Speler;
import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private Timer timer;
    private Vragenlijst vragenlijst;
    private List<Vraag> quizvragen;
    private ResultatenBerekenmethode resultatenBerekenmethode;

    public Quiz(Vragenlijst vragenlijst) {
        resultatenBerekenmethode = new NormaleBerekenmethode();
        this.vragenlijst = vragenlijst;

    }
public List<Vraag> getRandomVragen(){
    quizvragen = vragenlijst.getRandomVragen(10);
    return quizvragen;
}
    public void start() {
        timer = new Timer();
        timer.start();
    }

    public int eindigQuiz(Speler speler, List<String> antwoorden) {
        timer.stop();
        int score = getResultatenBerekenmethode().berekenScore(antwoorden, timer, quizvragen);
        getVragenlijst().werkLifeTimeBestBij(score);
        int munten = getResultatenBerekenmethode().berekenMunten(antwoorden, this.vragenlijst.getVragen());
        speler.geefMunten(munten);
        return score;
    }

    public List<Vraag> getQuizvragen() {
        return quizvragen;
    }

    public Timer getTimer() {
        return timer;
    }

    private ResultatenBerekenmethode getResultatenBerekenmethode() {
        return resultatenBerekenmethode;
    }

    private Vragenlijst getVragenlijst() {
        return vragenlijst;
    }
}
