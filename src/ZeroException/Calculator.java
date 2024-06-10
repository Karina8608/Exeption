package ZeroException;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

class Calculator {
    public double divide(double dividend, double divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Cannot divide by zero.");
        }
        return dividend / divisor;
    }
}


