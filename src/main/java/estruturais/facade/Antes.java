package estruturais.facade;

/**
 * Problema: o cliente precisa conhecer e orquestrar todos os subsistemas manualmente.
 * Qualquer nova tela de checkout repete essa sequencia de chamadas.
 */
public class Antes {

    static class EstoqueSemFachada {
        boolean verificarDisponibilidade(String produto) {
            System.out.println("[Estoque] Verificando: " + produto);
            return true;
        }
    }

    static class PagamentoSemFachada {
        boolean processar(double valor) {
            System.out.println("[Pagamento] Processando: R$ " + valor);
            return true;
        }
    }

    static class DespachaSemFachada {
        void despachar(String produto, String endereco) {
            System.out.println("[Despacho] Enviando " + produto + " para " + endereco);
        }
    }

    public static void demonstrar() {
        EstoqueSemFachada estoque = new EstoqueSemFachada();
        PagamentoSemFachada pagamento = new PagamentoSemFachada();
        DespachaSemFachada despacho = new DespachaSemFachada();

        String produto = "Notebook";
        double valor = 3500.0;
        String endereco = "Rua das Flores, 10";

        if (estoque.verificarDisponibilidade(produto)) {
            if (pagamento.processar(valor)) {
                despacho.despachar(produto, endereco);
            }
        }
        System.out.println(">> Cada tela repete essa orquestracao de 3 subsistemas.");
    }
}
