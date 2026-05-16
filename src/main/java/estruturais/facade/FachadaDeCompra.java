package estruturais.facade;

public class FachadaDeCompra {
    private final ServicoDeEstoque estoque = new ServicoDeEstoque();
    private final AutorizadorDePagamento pagamento = new AutorizadorDePagamento();
    private final ServicoDeDespacho despacho = new ServicoDeDespacho();

    public void finalizarCompra(String produto, double valor, String endereco) {
        if (estoque.verificarDisponibilidade(produto)) {
            if (pagamento.processar(valor)) {
                despacho.despachar(produto, endereco);
                System.out.println("[Compra] Finalizada com sucesso!");
            }
        }
    }
}
