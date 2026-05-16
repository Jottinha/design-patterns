package estruturais.proxy;

public class ProxyDeImagem implements Imagem {
    private final String arquivo;
    private ImagemReal imagemReal;

    public ProxyDeImagem(String arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public void exibir() {
        if (imagemReal == null) {
            imagemReal = new ImagemReal(arquivo);
        }
        imagemReal.exibir();
    }
}
