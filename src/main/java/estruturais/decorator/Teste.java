package estruturais.decorator;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA (sem o padrão) ===");
        Antes.demonstrar();

        System.out.println("\n=== SOLUÇÃO (Decorator) ===");
        Logger console = new ConsoleLogger();
        Logger file = new FileLogger(console);
        Logger completo = new LoggerCompleto(file);

        completo.log("Sistema iniciado com sucesso.");
    }
}
