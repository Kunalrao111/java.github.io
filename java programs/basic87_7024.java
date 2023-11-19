
            import java.util.Arrays;
    
            public class basic87_7024 {
            
                public static void main(String[] args) {
            
                    Integer[] arr = {1, 2, 3, 4, 5, 6};
                    int index = 3;
                    int element = 7;
            
                    // Print the original array
                    System.out.println("Original array: " + Arrays.toString(arr));
            
                    // Create a new array with one extra element
                    Integer[] newArr = new Integer[arr.length + 1];
            
                    // Copy all the elements from the original array to the new array
                    for (int i = 0; i < index; i++) {
                        newArr[i] = arr[i];
                    }
            
                    // Insert the new element at the specified index
                    newArr[index] = element;
            
                    // Copy the remaining elements from the original array to the new array
                    for (int i = index + 1; i < newArr.length; i++) {
                        newArr[i] = arr[i - 1];
                    }
            
                    // Print the new array
                    System.out.println("New array: " + Arrays.toString(newArr));
                }
            }
            
        