

            public class basic97_7024 {
                public static void main(String[] args) {
                    int[] arr = {0, 1, 0, 1, 0, 0, 1};
                    segregate0sAnd1s(arr);
                    printArray(arr);
                }
            
                private static void segregate0sAnd1s(int[] arr) {
                    int left = 0;
                    int right = arr.length - 1;
            
                    while (left < right) {
                        if (arr[left] == 1) {
                            int temp = arr[left];
                            arr[left] = arr[right];
                            arr[right] = temp;
                            right--;
                        } else {
                            left++;
                        }
                    }
                }
            
                private static void printArray(int[] arr) {
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }
            }
            
        