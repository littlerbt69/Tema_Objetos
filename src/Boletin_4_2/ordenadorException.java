package Boletin_4_2;

public class ordenadorException extends Exception {
    public ordenadorException() {
    }

    public ordenadorException(String message) {
        super(message);
    }

    public ordenadorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ordenadorException(Throwable cause) {
        super(cause);
    }

    public ordenadorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
