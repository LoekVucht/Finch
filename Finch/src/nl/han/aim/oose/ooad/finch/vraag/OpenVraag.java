package nl.han.aim.oose.ooad.finch.vraag;

import java.util.ArrayList;
import java.util.List;

public class OpenVraag extends Vraag{
    private List<Antwoord> antwoorden = new ArrayList<>();
    public OpenVraag(String vraag) {
        super(vraag);
    }

    public void voegAntwoordToe(Antwoord antwoord){
        antwoorden.add(antwoord);
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
