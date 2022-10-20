package nl.han.aim.oose.ooad.finch.vraag;

import java.util.ArrayList;
import java.util.List;

public class Meerkeuzevraag extends Vraag {
    private List<Antwoordoptie> antwoordopties = new ArrayList<>();

    public Meerkeuzevraag(String vraag) {
        super(vraag);
    }

    public void voegAntwoordToe(Antwoordoptie antwoordoptie) {
        antwoordopties.add(antwoordoptie);
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
            if (antwoordOptie.getAntwoord().equalsIgnoreCase(antwoord) && antwoordOptie.isJuist()) {
                return true;
            }
        }
        return false;
    }
}