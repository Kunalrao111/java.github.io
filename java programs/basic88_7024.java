

            import java.util.Arrays;
    
            public class basic88_7024 {
            
                public static void reverse(int[] arr) {
                    int start = 0;
                    int end = arr.length - 1;
                    while (start < end) {
                        int temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        start++;
                        end--;
                    }
                }
            
                public static void main(String[] args) {
                    int[] arr = {1, 2, 3, 4, 5};
            
                    System.out.println("Original array: " + Arrays.toString(arr));
                    reverse(arr);
                    System.out.println("Reversed array: " + Arrays.toString(arr));
                }
            }
            
        