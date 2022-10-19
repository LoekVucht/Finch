package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.List;

public class NormaleBerekenmethode implements PuntenBerekenmethode {

    @Override
    public int geefAantalPunten(List<IngevoerdAntwoord> ingevoerdeVragen, Timer timer, List<Vraag> quizVragen) {
        return berekenAantalGoed(ingevoerdeVragen,quizVragen) * 10;
    }
}
