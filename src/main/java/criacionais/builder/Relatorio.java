package criacionais.builder;

public class Relatorio {
    private final String titulo;
    private final String cabecalho;
    private final String corpo;
    private final String rodape;
    private final boolean temTabela;
    private final boolean temGrafico;

    Relatorio(RelatorioBuilder builder) {
        this.titulo = builder.titulo;
        this.cabecalho = builder.cabecalho;
        this.corpo = builder.corpo;
        this.rodape = builder.rodape;
        this.temTabela = builder.temTabela;
        this.temGrafico = builder.temGrafico;
    }

    @Override
    public String toString() {
        return "Relatorio{titulo='" + titulo + "'" +
               (cabecalho != null ? ", cabecalho='" + cabecalho + "'" : "") +
               ", corpo='" + corpo + "'" +
               (rodape != null ? ", rodape='" + rodape + "'" : "") +
               (temTabela ? ", [TABELA]" : "") +
               (temGrafico ? ", [GRAFICO]" : "") + "}";
    }
}
