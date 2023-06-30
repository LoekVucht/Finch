package nl.han.aim.oose.ooad.finch;

public class EuropeesBankensysteemAdapter implements BetalingsserviceAdapter {
    private EuropeesBankensysteem europeesBankensysteem = new EuropeesBankensysteem();
    @Override
    public void betalingVoltooien(double bedrag, String rekeningnummer) {
        europeesBankensysteem.betaal(bedrag, rekeningnummer);
    }
}
