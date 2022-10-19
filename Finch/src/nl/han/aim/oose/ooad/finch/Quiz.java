package nl.han.aim.oose.ooad.finch;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private int behaaldePunten;
    private int tijd;
    private boolean alleVragenGoedBeantwoord;
    private Timer timer;
    private Vragenlijst vragenlijst;
    private List<IngevoerdAntwoord> ingevoerdeAntwoorden = new ArrayList<>();
    private PuntenBerekenmethode puntenBerekenmethode;

    public Quiz(Vragenlijst vragenlijst) {
        this.vragenlijst = vragenlijst;
    }
}
