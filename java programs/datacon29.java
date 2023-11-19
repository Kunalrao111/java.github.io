public class datacon29 {
    public static void main(String[] args) {
        // Example octal number
        String octalNumber = "176";

        // Convert octal to decimal
        int decimalNumber = Integer.parseInt(octalNumber, 8);

        // Display the results
        System.out.println("Octal number: " + octalNumber);
        System.out.println("Decimal representation: " + decimalNumber);
    }
}
