package nl.han.aim.oose.ooad.finch;

public class NederlandsBankenSysteemAdapter implements BetalingsserviceAdapter {
    private NederlandsBankensysteem nederlandsBankensysteem = new NederlandsBankensysteem();
    @Override
    public void betalingVoltooien(double bedrag, String rekeningnummer) {
        nederlandsBankensysteem.voerBetalingUit(rekeningnummer, bedrag);
    }
}
