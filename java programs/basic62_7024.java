
            import java.util.Scanner;
    
            public class basic62_7024 {
                public static void main(String[] args) {
                    // Get the integer from the user
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the integer: ");
                    int number = scanner.nextInt();
            
                    // Display the multiplication table of the number
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(number + " * " + i + " = " + number * i);
                    }
                }
            }
            
        