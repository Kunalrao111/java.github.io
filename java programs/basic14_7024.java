
            import java.util.Scanner;
    
            public class basic14_7024 {
                public static void main(String[] args) {
                    // Create a Scanner object to read user input
                    Scanner scanner = new Scanner(System.in);
            
                    // Prompt the user to enter an integer
                    System.out.println("Enter an integer: ");
                    int n = scanner.nextInt();
            
                    // Calculate the value of n+nn+nnn
                    int sum = n + (n * 10) + (n * 100);
            
                    // Print the sum to the console
                    System.out.println("The sum of n+nn+nnn is: " + sum);
            
                    // Close the Scanner object
                    scanner.close();
                }
            }
            
        