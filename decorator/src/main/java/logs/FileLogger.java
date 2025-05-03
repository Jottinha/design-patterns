package logs;

import logs.decorator.LoggerDecorator;
import logs.decorator.Logger;

public class FileLogger extends LoggerDecorator  {
    public FileLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message){
        super.log("[ARQUIVO] teste.txt foi salvo no diretorio do projeto\n" + message);
    }
}
