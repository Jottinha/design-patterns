package estruturais.bridge;

public class RelatorioDeVendas extends Relatorio {

    public RelatorioDeVendas(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar() {
        exportador.exportar("Relatorio de Vendas: total=R$15.000, itens=320");
    }
}
