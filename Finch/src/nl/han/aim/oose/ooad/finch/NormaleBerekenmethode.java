package nl.han.aim.oose.ooad.finch;

public class NormaleBerekenmethode implements PuntenBerekenmethode {
    @Override
    public int geefAantalPunten(int aantalVragenGoed) {
        return aantalVragenGoed * 10;
    }
}
