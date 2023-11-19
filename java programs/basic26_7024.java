

            public class basic26_7024 {
                public static void main(String[] args) {
                    int number = 12345;
            
                    int sum = sumOfDigits(number);
            
                    System.out.println("The sum of the digits of the number is: " + sum);
                }
            
                public static int sumOfDigits(int number) {
                    if (number == 0) {
                        return 0;
                    }
            
                    int digit = number % 10;
                    int sum = digit + sumOfDigits(number / 10);
                    return sum;
                }
            }
            
        