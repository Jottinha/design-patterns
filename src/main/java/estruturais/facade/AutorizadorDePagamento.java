package estruturais.facade;

public class AutorizadorDePagamento {
    public boolean processar(double valor) {
        System.out.println("[Pagamento] Processando: R$ " + valor);
        return true;
    }
}
