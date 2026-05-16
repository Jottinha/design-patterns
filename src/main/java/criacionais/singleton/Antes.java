package criacionais.singleton;

/**
 * Problema: sem controle de instância, qualquer código pode criar múltiplos
 * gerenciadores de configuração, cada um com seu próprio estado independente.
 */
public class Antes {

    static class ConfiguracaoSemSingleton {
        private String ambiente = "producao";

        public String getAmbiente() {
            return ambiente;
        }

        public void setAmbiente(String ambiente) {
            this.ambiente = ambiente;
        }
    }

    public static void demonstrar() {
        ConfiguracaoSemSingleton config1 = new ConfiguracaoSemSingleton();
        ConfiguracaoSemSingleton config2 = new ConfiguracaoSemSingleton();

        config1.setAmbiente("desenvolvimento");

        System.out.println("config1.ambiente = " + config1.getAmbiente());
        System.out.println("config2.ambiente = " + config2.getAmbiente());
        System.out.println("Mesma instancia? " + (config1 == config2));
        System.out.println(">> Estados inconsistentes: cada parte do sistema tem sua propria configuracao.");
    }
}
