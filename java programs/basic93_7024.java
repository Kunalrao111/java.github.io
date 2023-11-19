

            public class basic93_7024 {
    
                public static int findSecondLargestNumber(int[] array) {
            
                    // Initialize the largest and secondLargest variables
                    int largest = array[0];
                    int secondLargest = array[0];
            
                    // Iterate over the array and compare each  element to the largest and secondLargest variables
                    for (int i = 1; i < array.length; i++) {
                        if (array[i] > largest) {
                            secondLargest = largest;
                            largest = array[i];
                        } else if (array[i] > secondLargest && array[i] != largest) {
                            secondLargest = array[i];
                        }
                    }
            
                    // Return the secondLargest variable
                    return secondLargest;
                }
            
                public static void main(String[] args) {
            
                    // Create an array of integers
                    int[] array = {10, 20, 30, 40, 50};
            
                    // Find the second largest number in the array
                    int secondLargestNumber = findSecondLargestNumber(array);
            
                    // Print the second largest number to the console
                    System.out.println("The second largest number in the array is: " + secondLargestNumber);
                }
            }
            
        