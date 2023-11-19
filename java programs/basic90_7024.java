
            import java.util.Arrays;
    
            public class basic90_7024 {
                public static void main(String[] args) {
                    int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
            
                    // Sort the array
                    Arrays.sort(arr);
            
                    // Iterate over the array and check for duplicate elements
                    for (int i = 0; i < arr.length - 1; i++) {
                        if (arr[i] == arr[i + 1]) {
                            System.out.println("Duplicate element: " + arr[i]);
                        }
                    }
                }
            }
            
        