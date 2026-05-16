package criacionais.abstractfactory;

public class CaixaDeTextoClara implements CaixaDeTexto {
    @Override
    public void renderizar() {
        System.out.println("[CaixaDeTexto-Clara] renderizando");
    }
}
