package estruturais.flyweight;

public class TipoDeArvore {
    private final String nome;
    private final String textura;
    private final String cor;

    public TipoDeArvore(String nome, String textura, String cor) {
        this.nome = nome;
        this.textura = textura;
        this.cor = cor;
    }

    public void renderizar(int x, int y) {
        System.out.println("[" + nome + "] cor=" + cor + " em (" + x + "," + y + ")");
    }

    public String getNome() {
        return nome;
    }
}
