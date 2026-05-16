package estruturais.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Problema: todas as imagens sao carregadas do disco ao criar a lista,
 * mesmo que nunca sejam exibidas ao usuario.
 */
public class Antes {

    static class ImagemRealSemProxy {
        private final String arquivo;

        ImagemRealSemProxy(String arquivo) {
            System.out.println("[DISCO] Carregando " + arquivo + "...");
            this.arquivo = arquivo;
        }

        void exibir() {
            System.out.println("[TELA] Exibindo " + arquivo);
        }
    }

    public static void demonstrar() {
        System.out.println("Criando lista de 5 imagens:");
        List<ImagemRealSemProxy> imagens = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            imagens.add(new ImagemRealSemProxy("foto" + i + ".jpg"));
        }

        System.out.println("\nExibindo apenas as 2 primeiras:");
        imagens.get(0).exibir();
        imagens.get(1).exibir();
        System.out.println(">> 3 imagens foram carregadas do disco sem necessidade.");
    }
}
