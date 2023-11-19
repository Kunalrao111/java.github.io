

            public class basic25_7024 {
                public static int add(int a, int b) {
                    // Initialize the sum variable
                    int sum = 0;
            
                    // While `b` is not equal to 0, keep adding the carry bit to the sum
                    while (b != 0) {
                        // Calculate the carry bit
                        int carry = a & b;
            
                        // Add the carry bit to the sum
                        sum = sum ^ carry;
            
                        // Shift the left bit of `b` by one position
                        b = b << 1;
                    }
            
                    // Return the sum
                    return sum;
                }
            
                public static void main(String[] args) {
                    int a = 10;
                    int b = 20;
            
                    // Add the two numbers without using any arithmetic operators
                    int sum = add(a, b);
            
                    // Print the sum to the console
                    System.out.println("The sum of the two numbers is: " + sum);
                }
            }
            
        