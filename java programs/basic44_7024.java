
            public class basic44_7024 {
                public static void main(String[] args) {
                    int number = 5;
            
                    // Calculate the factorial of the number
                    int factorial = factorial(number);
            
                    // Print the factorial of the number
                    System.out.println("The factorial of "
                     + number + " is: " + factorial);
                }
            
                public static int factorial(int number) {
                    if (number == 0) {
                        return 1;
                    } else {
                        return number * factorial(number - 1);
                    }
                }
            }
        