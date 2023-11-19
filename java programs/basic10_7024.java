
            import java.util.Scanner;
    
            public class basic10_7024 {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
            
                    System.out.println("Enter an integer: ");
                    int number = scanner.nextInt();
            
                    // Initialize the sum variable
                    int sum = 0;
            
                    // Iterate over the digits of the number 
                    
                    while (number > 0) {
                        sum += number % 10;
                        number /= 10;
                    }
            
                    // Print the sum of the digits
                    System.out.println("The sum of the digits is: " + sum);
                }
            }
            
        