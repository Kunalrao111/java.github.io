
            import java.util.Scanner;
    
            public class basic27_7024 {
                public static void main(String[] args) {
                    // Declare and initialize variables
                    Scanner scanner = new Scanner(System.in);
                    double radius, area;
            
                    // Prompt the user for the radius of the circle
                    System.out.print("Enter the radius of the circle: ");
                    radius = scanner.nextDouble();
            
                    // Calculate the area of the circle
                    area = Math.PI * radius * radius;
            
                    // Print the area of the circle
                    System.out.println("The area of the circle is: " + area);
            
                    scanner.close();
                }
            }
            
        