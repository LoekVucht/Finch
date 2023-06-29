package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Speler;

public class LifetimeBest {
    private int score;

    public LifetimeBest(int score, Speler speler) {
        this.score = score;
        speler.geefMunten(score);
    }

    public void werkLifetimeBestBij(int score) {
        if(betereScore(score)){
            this.score = score;
        }
    }

    private boolean betereScore(int score) {
        return score > this.score;
    }
}
