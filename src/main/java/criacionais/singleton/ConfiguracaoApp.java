package criacionais.singleton;

public class ConfiguracaoApp {

    private static volatile ConfiguracaoApp instancia;
    private String ambiente;

    private ConfiguracaoApp() {
        this.ambiente = "producao";
    }

    public static ConfiguracaoApp getInstance() {
        if (instancia == null) {
            synchronized (ConfiguracaoApp.class) {
                if (instancia == null) {
                    instancia = new ConfiguracaoApp();
                }
            }
        }
        return instancia;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
}
