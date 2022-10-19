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
    public void voegVragenlijstToe(Vragenlijst vragenlijst){
        vragenlijsten.add(vragenlijst);
    }
}
