package criacionais.builder;

/**
 * Problema: construtor telescopico. Com campos opcionais, o numero de construtores
 * cresce exponencialmente, ou o chamador precisa passar null para campos nao usados.
 */
public class Antes {

    static class RelatorioSemBuilder {
        private String titulo;
        private String cabecalho;
        private String corpo;
        private String rodape;
        private boolean temTabela;
        private boolean temGrafico;

        public RelatorioSemBuilder(String titulo, String cabecalho, String corpo,
                                   String rodape, boolean temTabela, boolean temGrafico) {
            this.titulo = titulo;
            this.cabecalho = cabecalho;
            this.corpo = corpo;
            this.rodape = rodape;
            this.temTabela = temTabela;
            this.temGrafico = temGrafico;
        }

        @Override
        public String toString() {
            return "Relatorio{titulo='" + titulo + "', cabecalho='" + cabecalho +
                   "', corpo='" + corpo + "', rodape='" + rodape +
                   "', temTabela=" + temTabela + ", temGrafico=" + temGrafico + "}";
        }
    }

    public static void demonstrar() {
        // O chamador precisa saber a ordem exata e passar null para o que nao usa
        RelatorioSemBuilder r1 = new RelatorioSemBuilder("Vendas", null, "Dados de vendas", null, true, false);
        RelatorioSemBuilder r2 = new RelatorioSemBuilder("Estoque", "Q1 2026", "Dados de estoque", "Confidencial", false, true);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(">> Leitura confusa: o que significa o 5o e 6o argumento?");
    }
}
