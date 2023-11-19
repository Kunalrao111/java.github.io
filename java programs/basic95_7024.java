

            public class basic95_7024 {
    
                public static void main(String[] args) {
                    // Declare and initialize the array
                    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            
                    // Initialize the counters for even and odd integers
                    int evenCount = 0;
                    int oddCount = 0;
            
                    // Iterate over the array and count the even and odd integers
                    for (int number : array) {
                        if (number % 2 == 0) {
                            evenCount++;
                        } else {
                            oddCount++;
                        }
                    }
            
                    // Print the number of even and odd integers
                    System.out.println("Number of even integers: " + evenCount);
                    System.out.println("Number of odd integers: " + oddCount);
                }
            }
            
        