
            public class basic20_7024 {
                public static void main(String[] args) {
                    int sum = 0;
                    int count = 0;
                    int number = 2;
            
                    while (count < 100) {
                        if (isPrime(number)) {
                            sum += number;
                            count++;
                        }
                        number++;
                    }
            
                    System.out.println
                    ("The sum of the first 100 prime numbers is: " + sum);
                }
            
                public static boolean isPrime(int number) {
                    for (int i = 2; i <= Math.sqrt(number); i++) {
                        if (number % i == 0) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            
        