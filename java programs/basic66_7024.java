

            import java.util.Scanner;
    
            public class basic66_7024 {
            
                public static void main(String[] args) {
                    // Create a Scanner object to read input from the user
                    Scanner scanner = new Scanner(System.in);
            
                    // Prompt the user to enter three numbers
                    System.out.println("Enter three numbers: ");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    int num3 = scanner.nextInt();
            
                    // Check if the numbers are in increasing order
                    if (num1 < num2 && num2 < num3) {
                        System.out.println("The numbers are in increasing order.");
                    }
            
                    // Check if the numbers are in decreasing order
                    else if (num1 > num2 && num2 > num3) {
                        System.out.println("The numbers are in decreasing order.");
                    }
            
                    // Otherwise, the numbers are not in any particular order
                    else {
                        System.out.println
                        ("The numbers are not in any particular order.");
                    }
            
                    // Close the Scanner object
                    scanner.close();
                }
            }
            
        