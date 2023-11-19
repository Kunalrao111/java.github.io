
            class B{
                public static int smallest(int a, int b, int c) {
                    int smallest = a;
                    if (b < smallest) {
                      smallest = b;
                    }
                    if (c < smallest) {
                      smallest = c;
                    }
                    return smallest;
                  }
                 }
        
            public static void main(String ar[]){
                int a = 5;
                int b = 7;
                int c = 2;
    
                int smallest = smallest(a, b, c);
    
                System.out.println("The smallest number is: " + smallest);
    
            }
    
        