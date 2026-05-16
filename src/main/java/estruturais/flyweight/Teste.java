package estruturais.flyweight;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA (sem o padrao) ===");
        Antes.demonstrar();

        System.out.println("\n=== SOLUCAO (Flyweight) ===");
        Mapa mapa = new Mapa();

        for (int i = 0; i < 10000; i++) {
            mapa.plantar(i, i * 2, "Pinheiro", "textura_pinheiro.png", "verde-escuro");
        }
        for (int i = 0; i < 5000; i++) {
            mapa.plantar(i, i * 3, "Carvalho", "textura_carvalho.png", "marrom");
        }
        for (int i = 0; i < 3000; i++) {
            mapa.plantar(i, i * 4, "Bambu", "textura_bambu.png", "verde-claro");
        }

        // Mostra apenas as 3 primeiras para nao poluir o terminal
        System.out.println("Primeiras 3 arvores renderizadas:");
        new Mapa() {{
            plantar(0, 0, "Pinheiro", "textura_pinheiro.png", "verde-escuro");
            plantar(1, 2, "Carvalho", "textura_carvalho.png", "marrom");
            plantar(2, 8, "Bambu", "textura_bambu.png", "verde-claro");
            renderizar();
        }};

        System.out.println("\nTotal de arvores no mapa: " + mapa.totalDeArvores());
        System.out.println("TipoDeArvore distintos criados: " + FabricaDeTipos.totalDeTiposCriados());
        System.out.println(">> 18.000 arvores compartilham apenas 3 objetos de tipo.");
    }
}
