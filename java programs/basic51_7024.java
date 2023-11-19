
            public class basic51_7024 {
    
                public static double calculatePowerOfNumber(double base, int exponent) {
                    double result = 1.0;
                    for (int i = 0; i < exponent; i++) {
                        result *= base;
                    }
                    return result;
                }
            
                public static void main(String[] args) {
                    double base = 2.0;
                    int exponent = 3;
            
                    double power = calculatePowerOfNumber(base, exponent);
            
                    System.out.println
                    ("The power of " + base + " to the power of " + 
                    exponent + " is: " + power);
                }
            }
            
        