
            public class basic43_7024 {
                public static int sumOfNNumbers(int n) {
                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        sum += i;
                    }
                    return sum;
                }
            
                public static void main(String[] args) {
                    int n = 10;
                    int sum = sumOfNNumbers(n);
                    System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
                }
            }
            
        