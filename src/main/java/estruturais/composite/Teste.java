package estruturais.composite;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA (sem o padrao) ===");
        Antes.demonstrar();

        System.out.println("\n=== SOLUCAO (Composite) ===");
        Pasta config = new Pasta("config");
        config.adicionar(new Arquivo("settings.json", 2048));
        config.adicionar(new Arquivo("db.properties", 512));

        Pasta raiz = new Pasta("projeto");
        raiz.adicionar(new Arquivo("readme.txt", 1024));
        raiz.adicionar(new Arquivo("app.jar", 512000));
        raiz.adicionar(config);

        raiz.exibir(0);
        System.out.println("\nTamanho total: " + raiz.getTamanhoEmBytes() + " bytes");
        System.out.println(">> Arquivos e pastas tratados uniformemente; sem instanceof.");
    }
}
