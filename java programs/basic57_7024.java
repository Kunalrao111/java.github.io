

            import java.util.Scanner;
    
            public class basic57_7024 {
            
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
            
                    // Get the 5 numbers from the keyboard
                    System.out.println("Enter 5 numbers: ");
                    int[] numbers = new int[5];
                    for (int i = 0; i < 5; i++) {
                        numbers[i] = scanner.nextInt();
                    }
            
                    // Calculate the sum of the 5 numbers
                    int sum = 0;
                    for (int number : numbers) {
                        sum += number;
                    }
            
                    // Calculate the average of the 5 numbers
                    double average = (double) sum / 5;
            
                    // Print the sum and average of the 5 numbers
                    System.out.println("The sum of the 5 numbers is: " + sum);
                    System.out.println("The average of the 5 numbers is: " + average);
            
                    scanner.close();
                }
            }
        