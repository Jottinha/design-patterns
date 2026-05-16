package estruturais.bridge;

public class RelatorioDeEstoque extends Relatorio {

    public RelatorioDeEstoque(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar() {
        exportador.exportar("Relatorio de Estoque: produtos=85, criticos=3");
    }
}
