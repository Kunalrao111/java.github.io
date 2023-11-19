
            import java.util.Scanner;
    
            public class basic127_7024 {
            
                public static void main(String[] args) {
            
                    // Create a Scanner object to read user input
                    Scanner scanner = new Scanner(System.in);
            
                    // Prompt the user to enter the side length of the pentagon
                    System.out.println("Enter the side length of the pentagon: ");
                    double sideLength = scanner.nextDouble();
            
                    // Find the area of the pentagon
                    double area = findAreaOfPentagon(sideLength);
            
                    // Print the area of the pentagon to the console
                    System.out.println("The area of the pentagon is: " + area);
                }
            }
            
        