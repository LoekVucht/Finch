package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.ArrayList;
import java.util.List;

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

    public String krijgOnderwerp() {
        return onderwerp;
    }

    public void voegVraag(Vraag vraag) {
        vragen.add(vraag);
    }
}
