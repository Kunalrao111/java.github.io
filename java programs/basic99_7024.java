

            import java.util.HashSet;
            import java.util.Set;
            
            public class basic99_7024 {
                public static void printUniqueElements(int[] arr) {
                    Set<integer> uniqueElements = new HashSet<>();
            
                    for (int element : arr) {
                        if (!uniqueElements.contains(element)) {
                            uniqueElements.add(element);
                            System.out.print(element + " ");
                        }
                    }
                }
            
                public static void main(String[] args) {
                    int[] arr = {1, 2, 3, 4, 5, 6, 2, 3, 7, 8};
            
                    printUniqueElements(arr);
                }
            }
            
        </integer>