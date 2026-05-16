package estruturais.proxy;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA (sem o padrao) ===");
        Antes.demonstrar();

        System.out.println("\n=== SOLUCAO (Proxy) ===");
        System.out.println("Criando lista de 5 proxies (sem carregar nada):");
        List<Imagem> imagens = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            imagens.add(new ProxyDeImagem("foto" + i + ".jpg"));
        }

        System.out.println("\nExibindo apenas as 2 primeiras:");
        imagens.get(0).exibir();
        imagens.get(1).exibir();
        System.out.println(">> Apenas 2 imagens foram carregadas — exatamente as exibidas.");
    }
}
