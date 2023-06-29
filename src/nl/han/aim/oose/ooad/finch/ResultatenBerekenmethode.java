package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.List;

public interface ResultatenBerekenmethode {
    int berekenScore(List<String> antwoorden, Timer timer, List<Vraag> quizVragen);

    default int berekenMunten(List<String> antwoorden, List<Vraag> quizvragen) {
        int aantalGoed = berekenAantalGoed(antwoorden,quizvragen);
        if (aantalGoed == quizvragen.size()) {
            return 2;
        }
        else {
            return 0;
        }
    }

   default int berekenAantalGoed(List<String> antwoorden, List<Vraag> quizvragen){
       int aantalGoed = 0;
       for(int i = 0; i < antwoorden.size(); i++){
           String invoer = antwoorden.get(i);
           Vraag vraag = quizvragen.get(i);
           if(vraag.isAntwoordJuist(invoer)){
               aantalGoed++;
           }
       }
       return aantalGoed;
    }
}
