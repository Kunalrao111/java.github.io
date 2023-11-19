
            import java.util.Scanner;
    
            public class basic111_7024 {
              public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
            
                // Prompt the user to enter the number of integers.
                System.out.println("Enter the number of integers: ");
                int n = scanner.nextInt();
            
                // Create an array to store the integers.
                int[] arr = new int[n];
            
                // Read the integers from the user.
                for (int i = 0; i < n; i++) {
                  System.out.println("Enter integer " + (i + 1) + ": ");
                  arr[i] = scanner.nextInt();
                }
            
                // Initialize the variables to store the sum of even and odd integers.
                int evenSum = 0;
                int oddSum = 0;
            
                // Iterate over the array and add the even and odd  integers to the corresponding variables.
                for (int i = 0; i < n; i++) {
                  if (arr[i] % 2 == 0) {
                    evenSum += arr[i];
                  } else {
                    oddSum += arr[i];
                  }
                }
            
                // Print the sum of even and odd integers.
                System.out.println("The sum of even integers is: " + evenSum);
                System.out.println("The sum of odd integers is: " + oddSum);
            
                scanner.close();
              }
            }
            
        