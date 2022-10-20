package nl.han.aim.oose.ooad.finch;

import java.util.concurrent.TimeUnit;

public class Timer {
    private long startTijdInSeconden;
    private long stopTijdInSeconden;

    public void start() {
        startTijdInSeconden = getAantalSysteemSecondenVerstreken();
    }

    public void stop() {
        stopTijdInSeconden = getAantalSysteemSecondenVerstreken();
    }

    public long getAantalSysteemSecondenVerstreken() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public long getStartTijdInSeconden() {
        return startTijdInSeconden;
    }
}
