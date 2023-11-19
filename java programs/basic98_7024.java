

            public class basic98_7024 {
                public static void rotateArray(int[] array) {
                    int lastElement = array[array.length - 1];
            
                    for (int i = array.length - 1; i > 0; i--) {
                        array[i] = array[i - 1];
                    }
            
                    array[0] = lastElement;
                }
            
                public static void main(String[] args) {
                    int[] array = {1, 2, 3, 4, 5};
            
                    System.out.println("Original array:");
                    System.out.println(Arrays.toString(array));
            
                    rotateArray(array);
            
                    System.out.println("Rotated array:");
                    System.out.println(Arrays.toString(array));
                }
            }
            
        