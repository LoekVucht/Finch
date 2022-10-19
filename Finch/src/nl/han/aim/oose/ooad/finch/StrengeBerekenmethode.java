package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.List;

public class StrengeBerekenmethode implements PuntenBerekenmethode {

    @Override
    public int geefAantalPunten(List<IngevoerdAntwoord> ingevoerdeVragen, Timer timer, List<Vraag> quizVragen) {
      int aantalGoed= berekenAantalGoed(ingevoerdeVragen,quizVragen);
      int punten = 0;
        if(aantalGoed == quizVragen.size()+1){
      punten =+ 2;
        }
        aantalGoed = aantalGoed * 5;
        punten += aantalGoed;
        return punten;
    }
}
