package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.List;

public class StrengeBerekenmethode implements ResultatenBerekenmethode {

    @Override
    public int berekenScore(List<String> antwoorden, Timer timer, List<Vraag> quizVragen) {
        int aantalGoed = berekenAantalGoed(antwoorden,quizVragen);
        int punten = 0;
        if(aantalGoed == quizVragen.size()) {
            punten += 50;
        }
        punten += aantalGoed * 5;
        if (timer.getStopTijdInSeconden() - timer.getStartTijdInSeconden() < 30) {
            punten += 5;
        }
        return punten;
    }
}
