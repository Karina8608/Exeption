package EmailException;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class EmailValidator {
    public void validate(String email) throws InvalidEmailException {
        if (email == null || email.isEmpty()) {
            throw new InvalidEmailException("Email address cannot be empty.");
        }

        if (!email.contains("@")) {
            throw new InvalidEmailException("Email address must contain '@'.");
        }

        if (email.startsWith("@") || email.endsWith("@") || email.endsWith(".")) {
            throw new InvalidEmailException("Invalid email format.");
        }

        // Additional checks (e.g., domain validation) can be added here.
    }
}



