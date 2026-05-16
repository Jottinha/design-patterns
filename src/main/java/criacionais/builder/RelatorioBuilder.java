package criacionais.builder;

public class RelatorioBuilder {
    String titulo;
    String cabecalho;
    String corpo;
    String rodape;
    boolean temTabela;
    boolean temGrafico;

    public RelatorioBuilder(String titulo, String corpo) {
        this.titulo = titulo;
        this.corpo = corpo;
    }

    public RelatorioBuilder comCabecalho(String cabecalho) {
        this.cabecalho = cabecalho;
        return this;
    }

    public RelatorioBuilder comRodape(String rodape) {
        this.rodape = rodape;
        return this;
    }

    public RelatorioBuilder comTabela() {
        this.temTabela = true;
        return this;
    }

    public RelatorioBuilder comGrafico() {
        this.temGrafico = true;
        return this;
    }

    public Relatorio construir() {
        return new Relatorio(this);
    }
}
