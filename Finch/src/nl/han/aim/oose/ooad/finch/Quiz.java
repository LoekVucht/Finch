package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Speler;
import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private int behaaldePunten;
    private int tijd;
    private boolean alleVragenGoedBeantwoord;
    private Timer timer;
    private Vragenlijst vragenlijst;
    private List<Vraag> quizvragen = new ArrayList<>();
    private List<IngevoerdAntwoord> ingevoerdeAntwoorden = new ArrayList<>();
    private PuntenBerekenmethode puntenBerekenmethode;
    private int aantalGoed;

    public Quiz(Vragenlijst vragenlijst) {
        puntenBerekenmethode = new NormaleBerekenmethode();
        this.vragenlijst = vragenlijst;
        quizvragen = vragenlijst.krijgRandomVragen(10);

        timer = new Timer();
        timer.start();
    }

    public void berekenScore(Speler speler) {
        timer.stop();
       int score =  puntenBerekenmethode.geefAantalPunten(ingevoerdeAntwoorden, timer, quizvragen);
        System.out.println("Score: " + score);
        vragenlijst.werkLifeTimeBestBij(score, timer, speler);
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
