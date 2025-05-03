import logs.FileLogger;
import logs.LoggerCompleto;
import logs.decorator.ConsoleLogger;
import logs.decorator.Logger;

public class Main {
    public static void main(String[] args) {
        Logger console = new ConsoleLogger();
        Logger file = new FileLogger(console);
        Logger completo = new LoggerCompleto(file);

        completo.log("\nSistema iniciado com sucesso.");
    }
}
