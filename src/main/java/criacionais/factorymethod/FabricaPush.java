package criacionais.factorymethod;

public class FabricaPush extends FabricaDeNotificadores {
    @Override
    public Notificador criar() {
        return new PushNotificador();
    }
}
