package criacionais.prototype;

public class Circulo implements Clonavel {
    public String cor;
    public int raio;
    public int x;
    public int y;

    public Circulo(String cor, int raio, int x, int y) {
        this.cor = cor;
        this.raio = raio;
        this.x = x;
        this.y = y;
    }

    private Circulo(Circulo origem) {
        this.cor = origem.cor;
        this.raio = origem.raio;
        this.x = origem.x + 10;
        this.y = origem.y + 10;
    }

    @Override
    public Clonavel clonar() {
        return new Circulo(this);
    }

    @Override
    public String toString() {
        return "Circulo{cor='" + cor + "', raio=" + raio + ", x=" + x + ", y=" + y + "}";
    }
}
