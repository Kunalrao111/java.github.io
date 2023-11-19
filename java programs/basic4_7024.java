
            import java.util.Scanner;
    
            public class basic4_7024 {
                public static void main(String[] args) {
                    // Declare two integer variables
                    int num1, num2;
            
                    // Create a Scanner object to read user input
                    Scanner scanner = new Scanner(System.in);
            
                    // Prompt the user to enter two numbers
                    System.out.println("Enter the first number: ");
                    num1 = scanner.nextInt();
            
                    System.out.println("Enter the second number: ");
                    num2 = scanner.nextInt();
            
                    // Calculate the sum, multiply, subtract, divide, 
                   
                    int sum = num1 + num2;
                    int product = num1 * num2;
                    int difference = num1 - num2;
                    int quotient = num1 / num2;
                    int remainder = num1 % num2;
            
                    // Print the results
                    System.out.println("The sum of the two numbers is: " + sum);
                    System.out.println("The product of the two numbers is: " + product);
                    System.out.println
                    ("The difference of the two numbers is: " + difference);
                    System.out.println
                    ("The quotient of the two numbers is: " + quotient);
                    System.out.println
                    ("The remainder of the two numbers is: " + remainder);
            
                    // Close the Scanner object
                    scanner.close();
                }
            }              
        