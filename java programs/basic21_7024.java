
            public class basic21_7024 {
                public static void main(String[] args) {
                    // Declare and initialize an array
                    int[] arr = {1, 2, 3, 4, 5};
            
                    // Create a new array to store the swapped elements
                    int[] newArray = new int[arr.length];
            
                    // Swap the first and last elements of the original array
                    int temp = arr[0];
                    arr[0] = arr[arr.length - 1];
                    arr[arr.length - 1] = temp;
            
                    // Copy the swapped elements to the new array
                    for (int i = 0; i < arr.length; i++) {
                        newArray[i] = arr[i];
                    }
            
                    // Print the original array
                    System.out.println("Original array:");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
            
                    // Print the new array
                    System.out.println("New array:");
                    for (int i = 0; i < newArray.length; i++) {
                        System.out.print(newArray[i] + " ");
                    }
                    System.out.println();
                }
            }
            
        