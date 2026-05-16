package criacionais.abstractfactory;

public class BotaoClaro implements Botao {
    @Override
    public void renderizar() {
        System.out.println("[Botao-Claro] renderizando");
    }
}
