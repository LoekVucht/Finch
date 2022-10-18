package nl.han.aim.oose.ooad.finch.gebruiker;

import nl.han.aim.oose.ooad.finch.Vragenlijst;
import nl.han.aim.oose.ooad.finch.gebruiker.Gebruiker;

import java.util.List;

public class Speler extends Gebruiker {
    private double saldo;
    //private Quiz quiz;
    private List<Vragenlijst> vragenlijsten;

    public Speler(String gebruikersnaam, String wachtwoord) {
        super(gebruikersnaam, wachtwoord);
        vragenlijsten.add(new Vragenlijst("voetbal", 100, 100));
    }

    public void toonVragenlijsten() {

    }
}
