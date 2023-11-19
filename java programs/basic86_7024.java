
            public class basic86_7024 {
                public static void main(String[] args) {
                    int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
            
                    // Initialize the maximum and minimum values
                    int max = array[0];
                    int min = array[0];
            
                    // Iterate over the array and update the 
                    
                    for (int i = 1; i < array.length; i++) {
                        if (array[i] > max) {
                            max = array[i];
                        } else if (array[i] <  min) {
                            min = array[i];
                        }
                    }
            
                    // Print the maximum and minimum values
                    System.out.println("Maximum value: " + max);
                    System.out.println("Minimum value: " + min);
                }
            }
            
        