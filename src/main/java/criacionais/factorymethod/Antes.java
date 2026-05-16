package criacionais.factorymethod;

/**
 * Problema: o cliente conhece e instancia diretamente cada tipo de notificador.
 * Adicionar um novo canal obriga a modificar esta classe — viola o Open/Closed Principle.
 */
public class Antes {

    static class ServicoDeNotificacaoAntes {
        public void enviar(String canal, String mensagem) {
            if (canal.equals("email")) {
                System.out.println("[EMAIL] Enviando: " + mensagem);
            } else if (canal.equals("sms")) {
                System.out.println("[SMS] Enviando: " + mensagem);
            } else if (canal.equals("push")) {
                System.out.println("[PUSH] Enviando: " + mensagem);
            } else {
                throw new IllegalArgumentException("Canal desconhecido: " + canal);
            }
        }
    }

    public static void demonstrar() {
        ServicoDeNotificacaoAntes servico = new ServicoDeNotificacaoAntes();
        servico.enviar("email", "Seu pedido foi confirmado");
        servico.enviar("sms", "Seu pedido foi confirmado");
        System.out.println(">> Para adicionar 'whatsapp', e preciso editar esta classe.");
    }
}
