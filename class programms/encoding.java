import java.util.Scanner;

public class encoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryInput, input;

        System.out.print("Enter a binary sequence (only 0s and 1s): ");
        binaryInput = scanner.nextLine();

        if (binaryInput.matches("[01]+")) {
            System.out.println("Valid binary input: " + binaryInput);
            System.out.print("Select encoding technique : ");
            input = scanner.nextLine();

            String result;
            switch (input.toLowerCase()) {
                case "unipolar":
                    result = unipolar(binaryInput);
                    System.out.print("Unipolar encoded output: ");
                    System.out.print(result);
                    System.out.println();
                    break;

                case "polar":
                    result = polar(binaryInput);
                    System.out.print("polar encoded output: ");
                    System.out.print(result);
                    System.out.println();
                    break;

                case "manchester":
                    result = manchester(binaryInput);
                    System.out.print("Unipolar encoded output: ");
                    System.out.print(result);
                    System.out.println();
                    break;

                case "difmanchester":
                    result = difmanchester(binaryInput);
                    System.out.print("Unipolar encoded output: ");
                    System.out.print(result);
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid encoding technique.");
                    break;
            }

        } else {
            System.out.println("Invalid input. Please enter only 0s and 1s.");
        }

        scanner.close();
    }

    static String unipolar(String binaryInput) {
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < binaryInput.length(); i++) {
            if (binaryInput.charAt(i) == '1') {
                encoded.append("1");
            } else {
                encoded.append("0");
            }
        }
        return encoded.toString();
    }

    static String polar(String binaryInput) {
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < binaryInput.length(); i++) {
            if (binaryInput.charAt(i) == '1') {
                encoded.append("+1");
            } else {
                encoded.append("-1");
            }
        }
        return encoded.toString();
    }

    static String manchester(String binaryInput) {
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < binaryInput.length(); i++) {
            if (binaryInput.charAt(i) == '1') {
                encoded.append("+1-1 ");
            } else {
                encoded.append("-1+1 ");
            }
        }
        return encoded.toString();
    }

    static String difmanchester(String binaryInput) {
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < binaryInput.length(); i++) {
            if (binaryInput.charAt(i) == '1') {
                encoded.append("-1+1 ");
            } else {
                encoded.append("+1-1 ");
            }
        }
        return encoded.toString();
    }
}
