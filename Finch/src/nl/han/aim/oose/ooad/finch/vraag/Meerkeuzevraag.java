package nl.han.aim.oose.ooad.finch.vraag;

import java.util.List;

public class Meerkeuzevraag extends Vraag {
    private List<AntwoordOptie> antwoordOpties;

    public Meerkeuzevraag(String vraag) {
        super(vraag);
    }

    @Override
    void toonVraag() {
        System.out.println(vraag);
        for (AntwoordOptie antwoordOptie : antwoordOpties) {
            System.out.println(antwoordOptie.getAntwoord());
        }
    }

    @Override
    boolean isAntwoordJuist(String antwoord) {
        for (AntwoordOptie antwoordOptie : antwoordOpties) {
            if (antwoordOptie.getAntwoord().equals(antwoord)) {
                return true;
            }
        }
        return false;
    }
}