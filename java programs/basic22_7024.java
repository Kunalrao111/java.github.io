
            public class basic22_7024 {
                public static void main(String[] args) {
                    // Declare an array of integers
                    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            
                    // Initialize two variables to count the 
                    
                    int evenCount = 0;
                    int oddCount = 0;
            
                    // Iterate over the array and count the 
                    
                    for (int element : arr) {
                        if (element % 2 == 0) {
                            evenCount++;
                        } else {
                            oddCount++;
                        }
                    }
            
                    // Print the results to the console
                    System.out.println("Number of even elements: " + evenCount);
                    System.out.println("Number of odd elements: " + oddCount);
                }
            }
            
        