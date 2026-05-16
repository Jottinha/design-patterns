package criacionais.abstractfactory;

public class FabricaTemaClaro implements FabricaDeUI {
    @Override
    public Botao criarBotao() {
        return new BotaoClaro();
    }

    @Override
    public CaixaDeTexto criarCaixa() {
        return new CaixaDeTextoClara();
    }
}
