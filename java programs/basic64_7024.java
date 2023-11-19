

            import java.util.Scanner;
    
            public class basic64_7024 {
                public static void main(String[] args) {
            
                    // Create a Scanner object to read user input
                    Scanner scanner = new Scanner(System.in);
            
                    // Prompt the user to enter a positive integer
                    System.out.println("Enter a positive integer: ");
                    int number = scanner.nextInt();
            
                    // Initialize the count variable
                    int count = 0;
            
                    // While the number is greater than zero, count 
                    
                    while (number > 0) {
                        count++;
                        number /= 10;
                    }
            
                    // Print the number of digits to the console
                    System.out.println("The number of digits is: " + count);
                }
            }
            
        