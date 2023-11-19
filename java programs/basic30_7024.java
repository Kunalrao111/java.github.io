

            import java.util.Scanner;
    
            public class basic30_7024 {
                public static void main(String[] args) {
                    // Declare and initialize variables
                    Scanner scanner = new Scanner(System.in);
                    double side, area;
            
                    // Prompt the user for the side of the equilateral triangle
                    System.out.print("Enter the side of the equilateral triangle: ");
                    side = scanner.nextDouble();
            
                    // Calculate the area of the equilateral triangle
                    area = Math.sqrt(3) / 4 * side * side;
            
                    // Print the area of the equilateral triangle
                    System.out.println("The area of the equilateral triangle is: " + area);
            
                    scanner.close();
                }
            }
            
        