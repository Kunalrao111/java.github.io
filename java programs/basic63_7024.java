

            import java.util.Scanner;
    
            public class basic63_7024 {
            
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
            
                    // Read the integer from the user
                    System.out.print("Enter an integer: ");
                    int number = scanner.nextInt();
            
                    // Check if the number is negative, zero, or positive
                    if (number < 0) {
                        System.out.println(number + " is a negative number.");
                    } else if (number == 0) {
                        System.out.println(number + " is zero.");
                    } else {
                        System.out.println(number + " is a positive number.");
                    }
            
                    scanner.close();
                }
            }
            
        