
            import java.util.Scanner;
    
            public class basic61_7024 {
            
                public static void main(String[] args) {
            
                    // Create a Scanner object to read user input
                    Scanner scanner = new Scanner(System.in);
            
                    // Prompt the user to enter the number of terms
                    System.out.println("Enter the number of terms: ");
                    int n = scanner.nextInt();
            
                    // Initialize the sum variable
                    int sum = 0;
            
                    // Iterate from 1 to n and print each odd number
                     
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 != 0) {
                            System.out.println(i);
                            sum += i;
                        }
                    }
            
                    // Print the sum of the odd natural 
                    
                    System.out.println
                    ("The sum of the first " + n + " odd natural numbers is: " + sum);
                }
            }
            
        