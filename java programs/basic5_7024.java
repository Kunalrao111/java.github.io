
            import java.util.Scanner;
    
            public class basic5_7024 {
                public static void main(String[] args) {
                    // Create a Scanner object to read user input
                    Scanner scanner = new Scanner(System.in);
            
                    // Declare five integer variables to store the five numbers
                    int num1, num2, num3, num4, num5;
            
                    // Prompt the user to enter five numbers
                    System.out.println("Enter five numbers: ");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    num3 = scanner.nextInt();
                    num4 = scanner.nextInt();
                    num5 = scanner.nextInt();
            
                    // Calculate the average of the five numbers
                    double average = (num1 + num2 + num3 + num4 + num5) / 5.0;
            
                    // Print the average
                    System.out.println("The average of the five numbers is: " + average);
            
                    // Close the Scanner object
                    scanner.close();
                }
            }
      