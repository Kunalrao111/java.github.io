
            public class basic60_7024 {
    
                public static void main(String[] args) {
                    // Get the integer from the user
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter an integer: ");
                    int integer = scanner.nextInt();
            
                    // Display the cube of the numbers up to the given integer
                    for (int i = 1; i <= integer; i++) {
                        int cube = i * i * i;
                        System.out.println("The cube of " + i + " is: " + cube);
                    }
            
                    scanner.close();
                }
            }
            
        