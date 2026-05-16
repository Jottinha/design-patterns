package estruturais.flyweight;

public class Arvore {
    private final int x;
    private final int y;
    private final TipoDeArvore tipo;

    public Arvore(int x, int y, TipoDeArvore tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void renderizar() {
        tipo.renderizar(x, y);
    }
}
