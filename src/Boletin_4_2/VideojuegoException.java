package Boletin_4_2;

public class VideojuegoException extends Exception{
    public VideojuegoException() {
    }

    public VideojuegoException(String message) {
        super(message);
    }

    public VideojuegoException(String message, Throwable cause) {
        super(message, cause);
    }

    public VideojuegoException(Throwable cause) {
        super(cause);
    }

    public VideojuegoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
