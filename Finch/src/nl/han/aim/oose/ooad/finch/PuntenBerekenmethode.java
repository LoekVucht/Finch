package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.List;

public interface PuntenBerekenmethode {
    int geefAantalPunten(List<IngevoerdAntwoord> ingevoerdeAntwoorden, Timer timer,List<Vraag> quizVragen);

   default int berekenAantalGoed(List<IngevoerdAntwoord> ingevoerdeAntwoorden, List<Vraag> quizVragen){
       int aantalGoed = 0;
       for(int i = 0; i < ingevoerdeAntwoorden.size(); i++){
           String invoer = ingevoerdeAntwoorden.get(i).krijgInvoer();
           Vraag vraag = quizVragen.get(i);
           if(vraag.isAntwoordJuist(invoer)){
               aantalGoed++;
           }
       }
       return aantalGoed;
    }
}
