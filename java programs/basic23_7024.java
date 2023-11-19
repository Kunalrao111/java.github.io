

            public class basic23_7024 {
                public static void main(String[] args) {
                    int number = 16;
            
                    // Initialize the square root variable
                    double squareRoot = 0;
            
                    // Iterate until the square root of the number is found
                    while (squareRoot * squareRoot <= number) {
                        squareRoot++;
                    }
            
                    // Print the square root
                    System.out.println("The square root of " 
                    + number + " is: " + squareRoot);
                }
            }
            
        