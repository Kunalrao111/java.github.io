
            import java.util.Scanner;
    
            public class basic34_7024 {
                public static void main(String[] args) {
                    // Declare and initialize variables
                    Scanner scanner = new Scanner(System.in);
                    double radius, volume;
            
                    // Prompt the user for the radius of the sphere
                    System.out.print("Enter the radius of the sphere: ");
                    radius = scanner.nextDouble();
            
                    // Calculate the volume of the sphere
                    volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
            
                    // Print the volume of the sphere
                    System.out.println("The volume of the sphere is: " + volume);
            
                    scanner.close();
                }
            }
            
        