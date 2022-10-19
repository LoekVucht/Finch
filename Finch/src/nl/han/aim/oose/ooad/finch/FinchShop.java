package nl.han.aim.oose.ooad.finch;

import nl.han.aim.oose.ooad.finch.gebruiker.Speler;

import java.util.ArrayList;
import java.util.List;

public class FinchShop {
    private List<Muntenpakket> muntenpakketten;
    private static List<Thema> themas = new ArrayList<>();
    private Speler speler;

    public FinchShop() {

    }

    public void voegVragenlijstToe(String themanaam, Vragenlijst vragenlijst) {
        Thema thema = krijgThema(themanaam);
        thema.voegVragenlijstToe(vragenlijst);
    }

    public Thema krijgThema(String name) {
        for (Thema thema : themas) {
            if (thema.krijgNaam() == name) {
                return thema;
            }
        }
        return null;
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
}
