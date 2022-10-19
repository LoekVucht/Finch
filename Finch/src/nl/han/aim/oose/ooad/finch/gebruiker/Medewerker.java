package nl.han.aim.oose.ooad.finch.gebruiker;

import nl.han.aim.oose.ooad.finch.FinchShop;
import nl.han.aim.oose.ooad.finch.Thema;
import nl.han.aim.oose.ooad.finch.Vragenlijst;
import nl.han.aim.oose.ooad.finch.gebruiker.Gebruiker;
import nl.han.aim.oose.ooad.finch.vraag.Vraag;

import java.util.List;

public class Medewerker extends Gebruiker {
    private FinchShop finchShop;
    private Vragenlijst vragenlijst;

    public Medewerker(String gebruikersnaam, String wachtwoord) {
        super(gebruikersnaam, wachtwoord);
        finchShop = new FinchShop();
    }

    public void maakNieuweVragenlijst(String onderwerp, int maximaleTijdInSeconden, double bedrag) {
        vragenlijst = new Vragenlijst(onderwerp, maximaleTijdInSeconden, bedrag);
    }

    public void voegVraagToe(Vraag vraag) {
        vragenlijst.voegVraag(vraag);
    }
    public void voegVragenlijsToe(String themaNaam) {
        finchShop.voegVragenlijstToe(themaNaam,vragenlijst);
    }
    public void voegThema(String themaNaam){
        finchShop.maakThema(themaNaam);
    }

}
