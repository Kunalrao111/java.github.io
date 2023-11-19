
            import java.util.Scanner;
            class Fibonacci2 {
                public static void main(String[] args) {
                   Scanner a=new Scanner(System.in);
                    int n=a.nextInt();
              
                  int firstTerm = 0, secondTerm = 1;
                  System.out.println("Fibonacci Series till " + n + " terms:");
              
                  for (int i = 1; i <= n; ++i) {
                    System.out.print(firstTerm + ", ");
              
                    // compute the next term
                    int nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                  }
                }
              }
        