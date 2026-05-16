package criacionais.factorymethod;

public class FabricaSms extends FabricaDeNotificadores {
    @Override
    public Notificador criar() {
        return new SmsNotificador();
    }
}
