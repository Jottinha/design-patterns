package criacionais.abstractfactory;

public class CaixaDeTextoEscura implements CaixaDeTexto {
    @Override
    public void renderizar() {
        System.out.println("[CaixaDeTexto-Escura] renderizando");
    }
}
