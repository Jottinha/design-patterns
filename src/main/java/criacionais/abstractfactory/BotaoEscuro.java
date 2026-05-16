package criacionais.abstractfactory;

public class BotaoEscuro implements Botao {
    @Override
    public void renderizar() {
        System.out.println("[Botao-Escuro] renderizando");
    }
}
