package estruturais.decorator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerCompleto extends LoggerDecorator {

    public LoggerCompleto(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        super.log("[" + timestamp + "] Execução da rotina de desenvolvimento\n" + message);
    }
}
