package criacionais.factorymethod;

public abstract class FabricaDeNotificadores {

    public abstract Notificador criar();

    public void notificar(String mensagem) {
        Notificador notificador = criar();
        notificador.enviar(mensagem);
    }
}
