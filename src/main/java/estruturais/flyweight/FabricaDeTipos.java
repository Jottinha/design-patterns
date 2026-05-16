package estruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeTipos {
    private static final Map<String, TipoDeArvore> cache = new HashMap<>();

    public static TipoDeArvore obter(String nome, String textura, String cor) {
        String chave = nome + textura + cor;
        return cache.computeIfAbsent(chave, k -> new TipoDeArvore(nome, textura, cor));
    }

    public static int totalDeTiposCriados() {
        return cache.size();
    }
}
