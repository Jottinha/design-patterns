package criacionais.factorymethod;

public class FabricaEmail extends FabricaDeNotificadores {
    @Override
    public Notificador criar() {
        return new EmailNotificador();
    }
}
