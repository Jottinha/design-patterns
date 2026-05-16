package criacionais.prototype;

public class Retangulo implements Clonavel {
    public String cor;
    public int largura;
    public int altura;
    public int x;
    public int y;

    public Retangulo(String cor, int largura, int altura, int x, int y) {
        this.cor = cor;
        this.largura = largura;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    private Retangulo(Retangulo origem) {
        this.cor = origem.cor;
        this.largura = origem.largura;
        this.altura = origem.altura;
        this.x = origem.x + 10;
        this.y = origem.y + 10;
    }

    @Override
    public Clonavel clonar() {
        return new Retangulo(this);
    }

    @Override
    public String toString() {
        return "Retangulo{cor='" + cor + "', largura=" + largura + ", altura=" + altura +
               ", x=" + x + ", y=" + y + "}";
    }
}
