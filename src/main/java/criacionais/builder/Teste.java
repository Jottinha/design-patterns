package criacionais.builder;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA (sem o padrao) ===");
        Antes.demonstrar();

        System.out.println("\n=== SOLUCAO (Builder) ===");
        Relatorio r1 = new RelatorioBuilder("Vendas", "Dados de vendas")
                .comTabela()
                .construir();

        Relatorio r2 = new RelatorioBuilder("Estoque", "Dados de estoque")
                .comCabecalho("Q1 2026")
                .comRodape("Confidencial")
                .comGrafico()
                .construir();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(">> Cada campo nomeado, sem nulls, leitura fluente.");
    }
}
