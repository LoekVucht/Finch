package nl.han.aim.oose.ooad.finch.gebruiker;

import nl.han.aim.oose.ooad.finch.FinchShop;
import nl.han.aim.oose.ooad.finch.Vragenlijst;
import nl.han.aim.oose.ooad.finch.vraag.Vraag;

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
        vragenlijst.voegVraagToe(vraag);
    }
    public void voegVragenlijstToe(String themaNaam) {
        finchShop.voegVragenlijstToe(themaNaam,vragenlijst);
    }
    public void voegThemaToe(String themaNaam){
        finchShop.maakThema(themaNaam);
    }

}
