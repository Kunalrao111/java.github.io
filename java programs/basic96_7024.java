
            public class basic96_7024 {
                public static int getDifference(int[] array) {
                  int difference = 0;
                  int largest = array[0];
                  int smallest = array[0];
              
                  for (int i = 1; i < array.length; i++) {
                    if (array[i] > largest) {
                      largest = array[i];
                    }
                    if (array[i] < smallest) {
                      smallest = array[i];
                    }
                  }
              
                  difference = largest - smallest;
                  return difference;
                }
              
                public static void main(String[] args) {
                  int[] array = {5, 7, 2, 4, 9};
              
                  int difference = getDifference(array);
              
                  System.out.println("The difference between the largest and smallest values in the array is: " + difference);
                }
              }
              
        