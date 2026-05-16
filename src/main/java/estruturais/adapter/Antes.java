package estruturais.adapter;

/**
 * Problema: a logica de traducao entre interfaces incompativeis fica espalhada
 * no codigo do cliente. Cada chamador repete a conversao de BRL para EUR.
 */
public class Antes {

    static class PagadorEuropeuLegado {
        public void fazerPagamento(String recipiente, double amountEuros) {
            System.out.println("[EU-PAY] Pagando " + amountEuros + " EUR para " + recipiente);
        }
    }

    public static void demonstrar() {
        PagadorEuropeuLegado pagador = new PagadorEuropeuLegado();

        // Conversao inline repetida em cada chamador
        String destinatario = "Fornecedor XYZ";
        double valorEmReais = 500.0;
        double taxaConversao = 0.18;
        double valorEmEuros = valorEmReais * taxaConversao;

        pagador.fazerPagamento(destinatario, valorEmEuros);
        System.out.println(">> Conversao BRL->EUR repetida em cada ponto de uso.");
    }
}
