package estruturais.adapter;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA (sem o padrao) ===");
        Antes.demonstrar();

        System.out.println("\n=== SOLUCAO (Adapter) ===");
        ProcessadorDePagamento processador = new AdaptadorDePagamento(new PagadorEuropeu());
        processador.processarPagamento("Fornecedor XYZ", 500.0);
        processador.processarPagamento("Fornecedor ABC", 1200.0);
        System.out.println(">> Cliente usa apenas ProcessadorDePagamento; conversao encapsulada no adapter.");
    }
}
