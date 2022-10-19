package nl.han.aim.oose.ooad.finch;

import java.util.ArrayList;
import java.util.List;

public class Thema {
    public String naam;
    public List<Vragenlijst> vragenlijsten= new ArrayList<>();

    public Thema(String naam) {
        this.naam = naam;
    }

    public String krijgNaam() {
        return naam;
    }
    public Vragenlijst krijgVragenlijst(String onderwerp){
        for (Vragenlijst vragenlijst: vragenlijsten){
            if(vragenlijst.krijgOnderwerp() == onderwerp){
                return new Vragenlijst(vragenlijst);
            }
        }
        return null;
    }
    public void voegVragenlijstToe(Vragenlijst vragenlijst){
        vragenlijsten.add(vragenlijst);
    }
}
