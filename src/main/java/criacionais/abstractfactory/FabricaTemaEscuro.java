package criacionais.abstractfactory;

public class FabricaTemaEscuro implements FabricaDeUI {
    @Override
    public Botao criarBotao() {
        return new BotaoEscuro();
    }

    @Override
    public CaixaDeTexto criarCaixa() {
        return new CaixaDeTextoEscura();
    }
}
