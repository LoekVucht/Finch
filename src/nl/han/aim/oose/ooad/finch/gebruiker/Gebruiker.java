package nl.han.aim.oose.ooad.finch.gebruiker;

public abstract class Gebruiker {
    protected String gebruikersnaam;
    protected String wachtwoord;

    public Gebruiker(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }
}
