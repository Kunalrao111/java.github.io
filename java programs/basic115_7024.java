
            import java.util.Scanner;
    
            public class basic115_7024 {
                public static void main(String[] args) {
                    // Declare variables to store the largest and smallest numbers.
                    int largestNumber = Integer.MIN_VALUE;
                    int smallestNumber = Integer.MAX_VALUE;
            
                    // Create a Scanner object to read user input.
                    Scanner scanner = new Scanner(System.in);
            
                    // Prompt the user to enter numbers until the user enters -1.
                    System.out.println
                    ("Enter numbers until you want to stop. Enter -1 to stop.");
                    int number = scanner.nextInt();
                    while (number != -1) {
                        // Update the largest and smallest numbers if necessary.
                        largestNumber = Math.max(largestNumber, number);
                        smallestNumber = Math.min(smallestNumber, number);
            
                        // Prompt the user to enter the next number.
                        number = scanner.nextInt();
                    }
            
                    // Close the Scanner object.
                    scanner.close();
            
                    // Display the largest and smallest numbers.
                    System.out.println("The largest number is: " + largestNumber);
                    System.out.println("The smallest number is: " + smallestNumber);
                }
            }
            
        