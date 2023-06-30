package nl.han.aim.oose.ooad.finch;

public class NederlandsBankenSysteemAdapter implements BetalingsserviceAdapter {
    private NederlandsBankensysteem nederlandsBankensysteem = new NederlandsBankensysteem();
    @Override
    public boolean betalingVoltooien(double bedrag, String rekeningnummer) {
        return nederlandsBankensysteem.voerBetalingUit(rekeningnummer, bedrag);
    }
}
