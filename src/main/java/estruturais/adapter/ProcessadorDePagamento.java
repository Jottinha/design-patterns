package estruturais.adapter;

public interface ProcessadorDePagamento {
    void processarPagamento(String destinatario, double valorEmReais);
}
