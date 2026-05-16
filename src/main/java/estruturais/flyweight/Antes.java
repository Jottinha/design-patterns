package estruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Problema: cada arvore armazena todos os dados, incluindo textura e cor que sao
 * identicas para milhares de arvores do mesmo tipo — enorme desperdicio de memoria.
 */
public class Antes {

    static class ArvoreCompleta {
        int x;
        int y;
        String tipo;
        String textura; // dado pesado, repetido em cada instancia
        String cor;

        ArvoreCompleta(int x, int y, String tipo, String textura, String cor) {
            this.x = x;
            this.y = y;
            this.tipo = tipo;
            this.textura = textura;
            this.cor = cor;
        }
    }

    public static void demonstrar() {
        List<ArvoreCompleta> arvores = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arvores.add(new ArvoreCompleta(i, i * 2, "Pinheiro", "textura_pinheiro_hd.png", "verde-escuro"));
        }
        System.out.println("Arvores criadas: " + arvores.size());
        System.out.println("Objetos distintos: " + arvores.size());
        System.out.println(">> 10.000 copias da mesma textura e cor ocupando memoria desnecessariamente.");
    }
}
