
            public class basic7_7024 {
                public static void main(String[] args) {
                    // Declare a decimal number variable
                    int decimalNumber = 10;
            
                    // Convert the decimal number to binary
                    String binaryNumber = "";
                    while (decimalNumber > 0) {
                        int remainder = decimalNumber % 2;
                        binaryNumber = remainder + binaryNumber;
                        decimalNumber /= 2;
                    }
            
                    // Print the binary number
                    System.out.println("The binary representation of the decimal number " 
                    + decimalNumber + " is " + binaryNumber);
                }
            }
        