package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.List;

public class NormaleBerekenmethode implements ResultatenBerekenmethode {

    @Override
    public int berekenScore(List<String> antwoorden, Timer timer, List<Vraag> quizvragen) {
        int aantalGoed = berekenAantalGoed(antwoorden, quizvragen);
        int punten = 0;
        if(aantalGoed == quizvragen.size()) {
            punten += 50;
        }
        punten += aantalGoed * 10;
        if (timer.getStopTijdInSeconden() - timer.getStartTijdInSeconden() < 30) {
            punten += 10;
        }
        return punten;
    }
}
