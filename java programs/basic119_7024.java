
            import java.util.Scanner;
    
            public class basic119_7024 {
                public static void main(String[] args) {
                    // Get the value of n from the user
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the value of n: ");
                    int n = scanner.nextInt();
            
                    // Calculate the sum of the series
                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        sum += i;
                    }
            
                    // Print the sum of the series
                    System.out.println("The sum of the series is: " + sum);
                }
            }
            
        