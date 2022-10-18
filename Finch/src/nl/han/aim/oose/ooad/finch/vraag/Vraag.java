package nl.han.aim.oose.ooad.finch.vraag;

public abstract class Vraag {
    protected String vraag;

    public Vraag(String vraag){
        this.vraag= vraag;
    }
    abstract void toonVraag();
    abstract boolean isAntwoordJuist(String antwoord);
}
