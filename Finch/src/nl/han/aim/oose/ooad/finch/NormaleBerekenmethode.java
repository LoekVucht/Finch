package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.List;

public class NormaleBerekenmethode implements PuntenBerekenmethode {

    @Override
    public int geefAantalPunten(List<IngevoerdAntwoord> ingevoerdeVragen, Timer timer, List<Vraag> quizVragen) {
        int aantalGoed = berekenAantalGoed(ingevoerdeVragen, quizVragen);
        int punten = 0;
        if(aantalGoed == quizVragen.size()) {
            punten += 50;
        }
        punten += aantalGoed * 10;
        return punten;
    }
}
