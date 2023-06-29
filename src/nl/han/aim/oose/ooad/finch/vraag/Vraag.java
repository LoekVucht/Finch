package nl.han.aim.oose.ooad.finch.vraag;

public abstract class Vraag {
    protected String vraag;

    public Vraag(String vraag){
        this.vraag= vraag;
    }

    public String getVraag() {
        return vraag;
    }

    public abstract boolean isAntwoordJuist(String antwoord);
}
