package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Speler;
import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vragenlijst {
    private String onderwerp;
    private int maximaleTijd;
    private double bedrag;
    private LifetimeBest lifetimeBest;
    private List<Vraag> vragen = new ArrayList<>();

    public Vragenlijst(String onderwerp, int maximaleTijdInSeconden, double bedrag) {
        this.onderwerp = onderwerp;
        this.maximaleTijd = maximaleTijdInSeconden;
        this.bedrag = bedrag;
    }

    public Vragenlijst(Vragenlijst vragenlijst) {
        this.onderwerp = vragenlijst.onderwerp;
        this.maximaleTijd = vragenlijst.maximaleTijd;
        this.bedrag = vragenlijst.bedrag;
        this.vragen = vragenlijst.vragen;
    }

    public String krijgOnderwerp() {
        return onderwerp;
    }

    public void voegVraagToe(Vraag vraag) {
        vragen.add(vraag);
    }

    public Vraag krijgRandomVraag() {
        return vragen.get(new Random().nextInt(vragen.size()));
    }

    public List<Vraag> krijgRandomVragen(int aantal) {
        List<Vraag> vragen = new ArrayList<>();
        Vraag gekozenVraag = null;
        for (int i = 0; i < aantal; i++) {
            while (true) {
                gekozenVraag = krijgRandomVraag();
                if (!vragen.contains(gekozenVraag)) {
                    vragen.add(gekozenVraag);
                    break;
                }
            }
        }
        return vragen;
    }

    public Vraag getVraag(int vraagIndex) {
        return vragen.get(vraagIndex);
    }

    public void werkLifeTimeBestBij(int punten, Timer time, Speler speler) {
        if (lifetimeBest == null) {
            lifetimeBest = new LifetimeBest(punten, time, speler);
        } else {
            lifetimeBest.controleerLifeTimeBest(punten, time, speler);
        }
    }

    public int getMaximaleTijd() {
        return maximaleTijd;
    }
}
