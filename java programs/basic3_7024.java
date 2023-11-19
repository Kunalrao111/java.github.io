
            import java.util.Scanner;
            public class basic3_7024 {
                public static void main(String[] args) {
                    // Create a Scanner object to read user input
                    Scanner scanner = new Scanner(System.in);
    
                    // Prompt the user to enter two numbers
                    System.out.println("Enter the first number: ");
                    int num1 = scanner.nextInt();
    
                    System.out.println("Enter the second number: ");
                    int num2 = scanner.nextInt();
    
                    // Calculate the product of the two numbers
                    int product = num1 * num2;
    
                    // Display the product
                    System.out.println("The product of the two numbers is: " + product);
    
                    // Close the Scanner object
                    scanner.close();
                }
            }
       