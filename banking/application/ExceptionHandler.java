package banking.application;

public class ExceptionHandler {

    // ===================== InvalidAmountException =====================
    public static class InvalidAmountException extends Exception {
        public InvalidAmountException(String message) {
            super(message);
        }
    }

    // ===================== InsufficientBalanceException =====================
    public static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    // ===================== InvalidLoginException =====================
    public static class InvalidLoginException extends Exception {
        public InvalidLoginException(String message) {
            super(message);
        }
    }
}
