
            public class basic8_7024 {
                public static void main(String[] args) {
                    // Declare a binary number variable
                    String binaryNumber = "1010";
            
                    // Convert the binary number to decimal
                    int decimalNumber = 0;
                    int power = 0;
                    for (int i = binaryNumber.length() - 1; i >= 0; i--) {
                        int digit = binaryNumber.charAt(i) - '0';
                        decimalNumber += digit * Math.pow(2, power);
                        power++;
                    }
            
                    // Print the decimal number
                    System.out.println("The decimal representation of the binary number "
                     + binaryNumber + " is " + decimalNumber);
                }
            }
            
        