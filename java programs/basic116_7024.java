
            public class basic116_7024 {
                public static void main(String[] args) {
                    int number, sumOfCubes;
            
                    for (int i = 1; i <= 600; i++) {
                        number = i;
                        sumOfCubes = 0;
            
                        while (number > 0) {
                            int digit = number % 10;
                            sumOfCubes += digit * digit * digit;
                            number /= 10;
                        }
            
                        if (sumOfCubes == i) {
                            System.out.println(i);
                        }
                    }
                }
            }
            
        