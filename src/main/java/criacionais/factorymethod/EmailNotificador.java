package criacionais.factorymethod;

public class EmailNotificador implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[EMAIL] Enviando: " + mensagem);
    }
}
