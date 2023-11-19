
            public class basic113_7024 {
    
                public static int calculateHCF(int num1, int num2) {
            
                    int hcf = 1;
                    for (int i = 1; i <= Math.min(num1, num2); i++) {
            
                           if (num1 % i == 0 && num2 % i == 0) {
                            hcf = i;
                        }
                    }
            
                    // Return the HCF
                    return hcf;
                }
            
                public static void main(String[] args) {
            
                    // Get the two numbers from the user
                    int num1 = 12;
                    int num2 = 18;
            
                    // Calculate the HCF of the two numbers
                    int hcf = calculateHCF(num1, num2);
            
                    // Print the HCF
                    System.out.println
                    ("The HCF of " + num1 + " and " + num2 + " is " + hcf);
                }
            }
            
        