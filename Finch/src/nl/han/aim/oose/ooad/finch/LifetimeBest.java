package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Speler;

public class LifetimeBest {
    private int aantalPunten;
    private Timer timer;

    public LifetimeBest(int punten, Timer time) {
        this.aantalPunten = punten;
        this.timer = time;
    }

    public void controleerLifeTimeBest(int punten, Timer time, Speler speler) {
        if(aantalPunten < punten){
            speler.geefMunten(punten - aantalPunten);
            this.aantalPunten = punten;
            this.timer = time;
        }
    }
}
