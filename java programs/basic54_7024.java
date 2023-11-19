
            public class basic54_7024 {
    
                public static boolean isPositive(double number) {
                    return number > 0;
                }
            
                public static boolean isNegative(double number) {
                    return number <  0;
                }
            
                public static void main(String[] args) {
                    double number = 5.0;
            
                    boolean isPositive = isPositive(number);
                    boolean isNegative = isNegative(number);
            
                    if (isPositive) {
                        System.out.println(number + " is a positive number.");
                    } else if (isNegative) {
                        System.out.println(number + " is a negative number.");
                    } else {
                        System.out.println(number + " is zero.");
                    }
                }
            }
            
        