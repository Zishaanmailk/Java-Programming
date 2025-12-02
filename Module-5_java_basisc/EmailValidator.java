import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        String email;
        if (args.length >= 1) {
            email = args[0];
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter email: ");
            email = sc.nextLine();
            sc.close();
        }

        try {
            validate(email);
            System.out.println("Email is valid: " + email);
        } catch (InvalidEmailException e) {
            System.out.println("InvalidEmailException caught: " + e.getMessage());
        }
    }

    static void validate(String email) throws InvalidEmailException {
        if (!email.contains("@")) throw new InvalidEmailException("Email must contain @ symbol");
    }
}
