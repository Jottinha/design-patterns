package estruturais.proxy;

public class ImagemReal implements Imagem {
    private final String arquivo;

    public ImagemReal(String arquivo) {
        System.out.println("[DISCO] Carregando " + arquivo + "...");
        this.arquivo = arquivo;
    }

    @Override
    public void exibir() {
        System.out.println("[TELA] Exibindo " + arquivo);
    }
}
