
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Set;
            
            public class basic89_7024 {
                public static void main(String[] args) {
                    int[] array1 = {1, 2, 3, 4, 5};
                    int[] array2 = {3, 4, 5, 6, 7};
            
                    // Create a HashSet to store the common elements.
                    Set <integer> commonElements = new HashSet<>();
            
                    // Iterate over the first array and add each element to the HashSet.
                    for (int element : array1) {
                        commonElements.add(element);
                    }
            
                    // Iterate over the second array and check if each element is present in the HashSet.
                    // If it is, add it to the commonElements Set.
                    for (int element : array2) {
                        if (commonElements.contains(element)) {
                            commonElements.add(element);
                        }
                    }
            
                    // Print the common elements.
                    System.out.println("Common elements between the two arrays:  " + commonElements);
                }
            }
            
        </integer>