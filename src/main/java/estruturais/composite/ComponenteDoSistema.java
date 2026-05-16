package estruturais.composite;

public interface ComponenteDoSistema {
    String getNome();
    long getTamanhoEmBytes();
    void exibir(int nivel);
}
