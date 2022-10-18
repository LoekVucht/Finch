package nl.han.aim.oose.ooad.finch;

public class Vragenlijst {
    private String onderwerp;
    private int maximaleTijd;
    private double bedrag;

    public Vragenlijst(String onderwerp, int maximaleTijdInSeconden, double bedrag) {
        this.onderwerp = onderwerp;
        this.maximaleTijd = maximaleTijdInSeconden;
        this.bedrag = bedrag;
    }

    public String getOnderwerp() {
        return onderwerp;
    }
}
