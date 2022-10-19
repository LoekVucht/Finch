package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.List;

public class Vragenlijst {
    private String onderwerp;
    private int maximaleTijd;
    private double bedrag;
    private List<Vraag> vragen;

    public Vragenlijst(String onderwerp, int maximaleTijdInSeconden, double bedrag) {
        this.onderwerp = onderwerp;
        this.maximaleTijd = maximaleTijdInSeconden;
        this.bedrag = bedrag;
    }

    public String getOnderwerp() {
        return onderwerp;
    }

}
