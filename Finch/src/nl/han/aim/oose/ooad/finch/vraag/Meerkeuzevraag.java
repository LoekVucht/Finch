package nl.han.aim.oose.ooad.finch.vraag;

import java.util.List;

public class Meerkeuzevraag extends Vraag {
    private List<Antwoordoptie> antwoordopties;

    public Meerkeuzevraag(String vraag) {
        super(vraag);
    }

    @Override
    public void toonVraag() {
        System.out.println(vraag);
        for (Antwoordoptie antwoordOptie : antwoordopties) {
            System.out.println(antwoordOptie.getAntwoord());
        }
    }

    @Override
    public boolean isAntwoordJuist(String antwoord) {
        for (Antwoordoptie antwoordOptie : antwoordopties) {
            if (antwoordOptie.getAntwoord().equals(antwoord)) {
                return true;
            }
        }
        return false;
    }
}