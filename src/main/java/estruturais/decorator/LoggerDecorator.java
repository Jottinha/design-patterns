package estruturais.decorator;

public abstract class LoggerDecorator implements Logger {

    private Logger logger;

    public LoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log(message);
    }
}
