package estruturais.composite;

public class Arquivo implements ComponenteDoSistema {
    private final String nome;
    private final long tamanho;

    public Arquivo(String nome, long tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public long getTamanhoEmBytes() {
        return tamanho;
    }

    @Override
    public void exibir(int nivel) {
        System.out.println("  ".repeat(nivel) + "- " + nome + " (" + tamanho + " bytes)");
    }
}
