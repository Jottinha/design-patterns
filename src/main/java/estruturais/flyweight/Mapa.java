package estruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private final List<Arvore> arvores = new ArrayList<>();

    public void plantar(int x, int y, String nome, String textura, String cor) {
        TipoDeArvore tipo = FabricaDeTipos.obter(nome, textura, cor);
        arvores.add(new Arvore(x, y, tipo));
    }

    public void renderizar() {
        for (Arvore arvore : arvores) {
            arvore.renderizar();
        }
    }

    public int totalDeArvores() {
        return arvores.size();
    }
}
