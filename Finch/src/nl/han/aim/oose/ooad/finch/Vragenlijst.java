package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vragenlijst {
    private String onderwerp;
    private int maximaleTijd;
    private double bedrag;
    private List<Vraag> vragen = new ArrayList<>();

    public Vragenlijst(String onderwerp, int maximaleTijdInSeconden, double bedrag) {
        this.onderwerp = onderwerp;
        this.maximaleTijd = maximaleTijdInSeconden;
        this.bedrag = bedrag;
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public void voegVraagToe(Vraag vraag) {
        vragen.add(vraag);
    }

    public Vraag getRandomVraag() {
        return vragen.get(new Random().nextInt(vragen.size()));
    }

    public List<Vraag> getRandomVragen(int aantal) {
        List<Vraag> vragen = new ArrayList<>();
        Vraag gekozenVraag = null;
        for (int i = 0; i < aantal; i++) {
            while (true) {
                gekozenVraag = getRandomVraag();
                if (!vragen.contains(gekozenVraag)) {
                    vragen.add(getRandomVraag());
                    break;
                }
            }
        }
        return vragen;
    }
}
