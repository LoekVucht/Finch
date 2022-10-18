package nl.han.aim.oose.ooad.finch.vraag;

import nl.han.aim.oose.ooad.finch.Gebruiker;

import java.util.List;

public class Openvraag extends Vraag{
    private List<Antwoord> antwoorden;
    public Openvraag(String vraag) {
        super(vraag);
    }

    @Override
    void toonVraag() {
 System.out.println(vraag);
    }

    @Override
    boolean isAntwoordJuist(String ingevoerdAntwoord) {
        for (Antwoord antwoord : antwoorden) {
            if (antwoord.getAntwoord().equals(ingevoerdAntwoord)) {
                return true;
            }
        }
        return false;
    }

}
