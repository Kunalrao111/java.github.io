
            public class basic83_7024 {
                public static int findIndex(int[] array, int element) {
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] == element) {
                            return i;
                        }
                    }
                    return -1;
                }
            
                public static void main(String[] args) {
                    int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
                    int element = 56;
            
                    int index = findIndex(array, element);
                    if (index != -1) {
                        System.out.println("The index of the element "
                         + element + " is " + index);
                    } else {
                        System.out.println("The element " + element +
                         " is not found in the array");
                    }
                }
            }
            
        