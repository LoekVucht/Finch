package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Speler;

import java.util.ArrayList;
import java.util.List;

public class FinchShop {
    private List<Muntenpakket> muntenpakketten;
    private static List<Thema> themas = new ArrayList<>();
    private Speler speler;
    private BetalingsserviceAdapter betalingsserviceAdapter = new EuropeesBankensysteemAdapter();
    public FinchShop(Speler speler) {
        this.speler = speler;
    }
    public FinchShop(){}

    public void voegVragenlijstToe(String themanaam, Vragenlijst vragenlijst) {
        Thema thema = getThema(themanaam);
        thema.voegVragenlijstToe(vragenlijst);
    }

    public Thema getThema(String naam) {
        for (Thema thema : themas) {
            if (thema.krijgNaam() == naam) {
                return thema;
            }
        }
        return null;
    }

    public Speler krijgSpeler(){
        return speler;
    }

    public void maakThema(String themaNaam) {
        themas.add(new Thema(themaNaam));
    }

    public Vragenlijst krijgVragenlijst(String onderwerp) {
        for (Thema thema : themas) {
            if (thema.krijgVragenlijst(onderwerp) != null) {
                return thema.krijgVragenlijst(onderwerp);
            }
        }
        return null;
    }

    public List<Vragenlijst> getBasisVragenlijsten() {
        List<Vragenlijst> vragenlijsten = new ArrayList<>();
        vragenlijsten.add(krijgVragenlijst("Voetbal"));
        return vragenlijsten;
    }

    public void setBetalingsserviceAdapter(BetalingsserviceAdapter betalingsserviceAdapter) {
        this.betalingsserviceAdapter = betalingsserviceAdapter;
    }

    public BetalingsserviceAdapter getBetalingsserviceAdapter() {
        return betalingsserviceAdapter;
    }

    public boolean betaal(double bedrag, String rekeningnummer) {
        return betalingsserviceAdapter.betalingVoltooien(bedrag, rekeningnummer);
    }
}
