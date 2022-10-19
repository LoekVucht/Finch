package nl.han.aim.oose.ooad.finch;

public class StrengeBerekenmethode implements PuntenBerekenmethode {
    @Override
    public int geefAantalPunten(int aantalVragenGoed) {
        return aantalVragenGoed * 5;
    }
}
