package Examen_2024;

public class DispositivoNoCompatibleException extends Exception{

    public DispositivoNoCompatibleException() {
    }

    public DispositivoNoCompatibleException(String message) {
        super(message);
    }

    public DispositivoNoCompatibleException(String message, Throwable cause) {
        super(message, cause);
    }

    public DispositivoNoCompatibleException(Throwable cause) {
        super(cause);
    }

    public DispositivoNoCompatibleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
