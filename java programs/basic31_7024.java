
            public class basic31_7024 {
    
                public static double calculateArea(double diagonal1, double diagonal2) {
                    return (diagonal1 * diagonal2) / 2;
                }
            
                public static void main(String[] args) {
            
                    // Declare two variables to store the diagonals of the rhombus
                    double diagonal1 = 10;
                    double diagonal2 = 20;
            
                    // Calculate the area of the rhombus using the method
                    double area = calculateArea(diagonal1, diagonal2);
            
                    // Print the area to the console
                    System.out.println("The area of the rhombus is: " + area);
                }
            }
            
        