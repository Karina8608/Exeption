package EmailException;

public class Main {
    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();

        try {
            validator.validate("user@example.com");
            validator.validate("invalid.email");
            validator.validate("user@.com");
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
