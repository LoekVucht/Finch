package nl.han.aim.oose.ooad.finch.gebruiker;

import nl.han.aim.oose.ooad.finch.Vragenlijst;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Speler extends Gebruiker {
    private double saldo;
    //private Quiz quiz;
    private List<Vragenlijst> vragenlijsten = new ArrayList<>();

    public Speler(String gebruikersnaam, String wachtwoord) {
        super(gebruikersnaam, wachtwoord);
        vragenlijsten.add(new Vragenlijst("voetbal", 100, 100));
    }

    // TODO: thema tonen dat bij een vragenlijst hoort? Bijv. "Sport - voetbal" tonen ipv alleen het onderwerp "voetbal"
    public void toonVragenlijsten() {
        System.out.println("Je bezit de volgende vragenlijsten:");
        List<String> onderwerpen = new ArrayList<>();
        for (Vragenlijst vragenlijst : vragenlijsten) {
            System.out.println(vragenlijst.getOnderwerp());
        }
    }
}
