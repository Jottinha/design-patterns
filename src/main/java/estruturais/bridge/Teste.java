package estruturais.bridge;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA (sem o padrao) ===");
        Antes.demonstrar();

        System.out.println("\n=== SOLUCAO (Bridge) ===");
        Relatorio vendasPdf = new RelatorioDeVendas(new ExportadorPdf());
        Relatorio vendasCsv = new RelatorioDeVendas(new ExportadorCsv());
        Relatorio estoquePdf = new RelatorioDeEstoque(new ExportadorPdf());
        Relatorio estoqueCsv = new RelatorioDeEstoque(new ExportadorCsv());

        vendasPdf.gerar();
        vendasCsv.gerar();
        estoquePdf.gerar();
        estoqueCsv.gerar();

        System.out.println(">> Novo formato XML: apenas ExportadorXml. Novo relatorio: apenas nova subclasse de Relatorio.");
    }
}
