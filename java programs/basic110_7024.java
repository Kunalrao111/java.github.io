
            import java.util.Scanner;
    
            public class basic110_7024 {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
            
                    System.out.println("Enter an integer: ");
                    int number = scanner.nextInt();
            
                    int reversedNumber = 0;
            
                    while (number != 0) {
                        int lastDigit = number % 10;
                        reversedNumber = reversedNumber * 10 + lastDigit;
                        number /= 10;
                    }
            
                    System.out.println("The reversed number is: " + reversedNumber);
                }
            }
            
        