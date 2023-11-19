
            public class basic136_7024 {
                public static int roundUp(int dividend, int divisor) {
                  double quotient = (double) dividend / divisor;
                  quotient += 0.5;
                  int roundedQuotient = Math.round(quotient);
                  return roundedQuotient;
                }
              
                public static void main(String[] args) {
                  int dividend = 13;
                  int divisor = 4;
              
                  int roundedQuotient = roundUp(dividend, divisor);
              
                  System.out.println("The rounded quotient is: " + roundedQuotient);
                }
              }
              
        