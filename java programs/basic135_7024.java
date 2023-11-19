
            public class basic135_7024 {
                public static boolean isInteger(double number) {
                    return number % 1 == 0 && number >= -2147483648 &&
                     number <= 2147483647;
                }
            
                public static void main(String[] args) {
                    double number = 5.0;
            
                    boolean isInteger = isInteger(number);
            
                    if (isInteger) {
                        System.out.println("The double number is an integer.");
                    } else {
                        System.out.println("The double number is not an integer.");
                    }
                }
            }
            
        