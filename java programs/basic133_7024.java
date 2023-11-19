
            public class basic133_7024 {
                public static void main(String[] args) {
                    int number = 12345;
                    int reversedNumber = 0;
            
                    while (number > 0) {
                        int remainder = number % 10;
                        reversedNumber = reversedNumber * 10 + remainder;
                        number /= 10;
                    }
            
                    System.out.println
                    ("The reverse of the given number is: " + reversedNumber);
                }
            }
            
        