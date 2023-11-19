
            import java.util.Scanner;
    
            public class basic39_7024 {
                public static void main(String[] args) {
                    // Declare and initialize variables
                    Scanner scanner = new Scanner(System.in);
                    double radius, height, surfaceArea;
            
                    // Prompt the user for the radius and height of the cylinder
                    System.out.print("Enter the radius of the cylinder: ");
                    radius = scanner.nextDouble();
            
                    System.out.print("Enter the height of the cylinder: ");
                    height = scanner.nextDouble();
            
                    // Calculate the surface area of the cylinder
                    surfaceArea = 2 * Math.PI * radius * height +
                     2 * Math.PI * radius * radius;
            
                    // Print the surface area of the cylinder
                    System.out.println("The surface area of the cylinder is: "
                     + surfaceArea);
            
                    scanner.close();
                }
            }
        