package criacionais.abstractfactory;

public class Tela {
    private final Botao botao;
    private final CaixaDeTexto caixa;

    public Tela(FabricaDeUI fabrica) {
        this.botao = fabrica.criarBotao();
        this.caixa = fabrica.criarCaixa();
    }

    public void renderizar() {
        botao.renderizar();
        caixa.renderizar();
    }
}
