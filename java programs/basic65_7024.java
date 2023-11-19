
            import java.util.Scanner;
    
        public class basic65_7024 {
            public static void main(String[] args) {
                // Get the three numbers from the user
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the first number: ");
                int firstNumber = scanner.nextInt();
                System.out.println("Enter the second number: ");
                int secondNumber = scanner.nextInt();
                System.out.println("Enter the third number: ");
                int thirdNumber = scanner.nextInt();
    
                // Check if all the numbers are equal
                boolean allNumbersEqual = false;
                if (firstNumber == secondNumber && secondNumber == thirdNumber) {
                    allNumbersEqual = true;
                }
    
                // Print whether all the numbers are equal or not
                if (allNumbersEqual) {
                    System.out.println("All the numbers are equal.");
                } else {
                    System.out.println("Not all the numbers are equal.");
                }
        }
    }
    
        