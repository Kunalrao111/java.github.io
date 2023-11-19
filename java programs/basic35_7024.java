

            public class basic35_7024 {
    
                public static double calculateVolume(double radius, double height) {
                    return Math.PI * radius * radius * height;
                }
            
                public static void main(String[] args) {
            
                    // Declare two variables to store the 
                
                    double radius = 5;
                    double height = 10;
            
                    // Calculate the volume of the cylinder using the method
                    double volume = calculateVolume(radius, height);
            
                    // Print the volume to the console
                    System.out.println("The volume of the cylinder is: " + volume);
                }
            }
            
        