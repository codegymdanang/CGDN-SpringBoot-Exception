package codegym.vn.expection.checkuncheck;

public class CustomerException extends Exception {

    public CustomerException(String message) {
        super(message);
    }

    public CustomerException(String message, Throwable cause) {
        super(message, cause);
    }

}
