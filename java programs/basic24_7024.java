

            public class basic24_7024 {
                public static boolean isPalindrome(int n) {
                    // Check if the number is negative
                    if (n < 0) {
                        return false;
                    }
            
                    // Reverse the number
                    int reversedNumber = 0;
                    while (n > 0) {
                        reversedNumber = reversedNumber * 10 + n % 10;
                        n /= 10;
                    }
            
                    // Check if the reversed number is equal to the original number
                    return reversedNumber == n;
                }
            
                public static void main(String[] args) {
                    // Declare and initialize a number
                    int n = 121;
            
                    // Check if the number is a palindrome
                    boolean isPalindrome = isPalindrome(n);
            
                    // Print the result
                    if (isPalindrome) {
                        System.out.println(n + " is a palindrome.");
                    } else {
                        System.out.println(n + " is not a palindrome.");
                    }
                }
            }
            
        