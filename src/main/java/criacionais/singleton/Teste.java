package criacionais.singleton;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA (sem o padrao) ===");
        Antes.demonstrar();

        System.out.println("\n=== SOLUCAO (Singleton) ===");
        ConfiguracaoApp config1 = ConfiguracaoApp.getInstance();
        ConfiguracaoApp config2 = ConfiguracaoApp.getInstance();

        config1.setAmbiente("desenvolvimento");

        System.out.println("config1.ambiente = " + config1.getAmbiente());
        System.out.println("config2.ambiente = " + config2.getAmbiente());
        System.out.println("Mesma instancia? " + (config1 == config2));
        System.out.println(">> Uma unica instancia compartilhada em toda a aplicacao.");
    }
}
