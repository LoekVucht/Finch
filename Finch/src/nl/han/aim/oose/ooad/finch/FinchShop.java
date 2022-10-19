package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Speler;

import java.util.List;

public class FinchShop {
    private List<Muntenpakket> muntenpakketten;
    private static List<Vragenlijst> vragenlijsten;
    private Speler speler;

    public FinchShop() {
        voegVragenlijstToe(new Vragenlijst("voetbal", 100, 100));
     //   voegVragenlijstToe(new Vragenlijst("voetbal", 100, 100));
    }

    private void voegVragenlijstToe(Vragenlijst vragenlijst){
        vragenlijsten.add(vragenlijst);
    }
}
