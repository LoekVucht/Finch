package nl.han.aim.oose.ooad.finch.vraag;

public class AntwoordOptie {
    private String antwoord;
    private boolean isJuist;

    public AntwoordOptie(String antwoord, boolean isJuist) {
        this.antwoord = antwoord;
        this.isJuist = isJuist;
    }
    public String getAntwoord() {
        return antwoord;
    }

    public boolean isJuist() {
        return isJuist;
    }
}
