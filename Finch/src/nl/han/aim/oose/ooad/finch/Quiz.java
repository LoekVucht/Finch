package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Speler;
import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private Timer timer;
    private Vragenlijst vragenlijst;
    private List<Vraag> quizvragen;
    private List<IngevoerdAntwoord> ingevoerdeAntwoorden = new ArrayList<>();
    private PuntenBerekenmethode puntenBerekenmethode;

    public Quiz(Vragenlijst vragenlijst) {
        this.vragenlijst = vragenlijst;
        quizvragen = vragenlijst.krijgRandomVragen(10);
        puntenBerekenmethode = new NormaleBerekenmethode();
        timer = new Timer();
        timer.start();
    }

    public void berekenScore(Speler speler) {
        timer.stop();
        System.out.println("Score: " + puntenBerekenmethode.geefAantalPunten(ingevoerdeAntwoorden, timer, quizvragen));
    }

    public void beantwoordVraag(String antwoord) {
        ingevoerdeAntwoorden.add(new IngevoerdAntwoord(antwoord));
    }

    public List<Vraag> getQuizvragen() {
        return quizvragen;
    }

    public Timer getTimer() {
        return timer;
    }
}
