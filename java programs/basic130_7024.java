
            public class basic130_7024 {
                
                public static void displayPrimeNumbersUpTo20() {
                    for (int i = 2; i <= 20; i++) {
                        boolean isPrime = true;
                        for (int j = 2; j <= Math.sqrt(i); j++) {
                            if (i % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.println(i);
                        }
                    }
                }
            }
        