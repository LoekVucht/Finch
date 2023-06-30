package nl.han.aim.oose.ooad.finch;

public class EuropeesBankensysteemAdapter implements BetalingsserviceAdapter {
    private EuropeesBankensysteem europeesBankensysteem = new EuropeesBankensysteem();
    @Override
    public boolean betalingVoltooien(double bedrag, String rekeningnummer) {
        return europeesBankensysteem.betaal(bedrag, rekeningnummer);
    }
}
