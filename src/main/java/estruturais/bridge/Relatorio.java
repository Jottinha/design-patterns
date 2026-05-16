package estruturais.bridge;

public abstract class Relatorio {
    protected final Exportador exportador;

    protected Relatorio(Exportador exportador) {
        this.exportador = exportador;
    }

    public abstract void gerar();
}
