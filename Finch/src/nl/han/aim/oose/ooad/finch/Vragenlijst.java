package nl.han.aim.oose.ooad.finch;

public class Vragenlijst {
    private String onderwerp;
    private int maximaleTijd;
    private double bedrag;

    public Vragenlijst(String onderwerp, int maximaleTijd, double bedrag) {
        this.onderwerp = onderwerp;
        this.maximaleTijd = maximaleTijd;
        this.bedrag = bedrag;
    }
}
