package estruturais.decorator;

/**
 * Problema: para cada combinação de funcionalidades de log, precisamos de uma nova subclasse.
 * Adicionar "log remoto" exige criar LogServidorRemoto, LogArquivoServidorRemoto,
 * LogCriptografadoServidorRemoto... a explosão de subclasses é inevitável.
 */
public class Antes {

    abstract static class LoggerBase {
        abstract void log(String mensagem);
    }

    static class LogConsole extends LoggerBase {
        @Override
        void log(String mensagem) {
            System.out.println("[CONSOLE] " + mensagem);
        }
    }

    static class LogArquivo extends LoggerBase {
        @Override
        void log(String mensagem) {
            System.out.println("[ARQUIVO] " + mensagem);
        }
    }

    static class LogServidor extends LoggerBase {
        @Override
        void log(String mensagem) {
            System.out.println("[SERVIDOR] " + mensagem);
        }
    }

    // Para combinar Console + Arquivo, precisamos de uma nova subclasse:
    static class LogConsoleArquivo extends LoggerBase {
        @Override
        void log(String mensagem) {
            System.out.println("[CONSOLE] " + mensagem);
            System.out.println("[ARQUIVO] " + mensagem);
        }
    }

    // Adicionar criptografia exige ainda mais subclasses:
    static class LogArquivoCriptografado extends LoggerBase {
        @Override
        void log(String mensagem) {
            System.out.println("[ARQUIVO-CRIPT] " + mensagem.hashCode()); // simula criptografia
        }
    }

    static class LogServidorCriptografado extends LoggerBase {
        @Override
        void log(String mensagem) {
            System.out.println("[SERVIDOR-CRIPT] " + mensagem.hashCode());
        }
    }
    // ... e assim por diante. Com N tipos de destino e M funcionalidades extras,
    // o número de subclasses cresce como N * M.

    public static void demonstrar() {
        System.out.println(">> Cada combinação exige uma nova subclasse:");
        new LogConsole().log("Sistema iniciado");
        new LogArquivo().log("Sistema iniciado");
        new LogConsoleArquivo().log("Sistema iniciado");
        new LogArquivoCriptografado().log("Sistema iniciado");
    }
}
