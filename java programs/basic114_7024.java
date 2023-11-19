
            import java.util.Scanner;
    
            public class basic114_7024 {
            
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    int positiveCount = 0;
                    int negativeCount = 0;
                    int zeroCount = 0;
            
                    boolean continueEntering = true;
                    while (continueEntering) {
                        System.out.println("Enter a number: ");
                        int number = scanner.nextInt();
            
                        if (number > 0) {
                            positiveCount++;
                        } else if (number < 0) {
                            negativeCount++;
                        } else {
                            zeroCount++;
                        }
            
                        System.out.println
                        ("Do you want to continue entering numbers? (Y/N)");
                        String choice = scanner.next();
                        if (!choice.equals("Y")) {
                            continueEntering = false;
                        }
                    }
            
                    System.out.println("Number of positive numbers: " + positiveCount);
                    System.out.println("Number of negative numbers: " + negativeCount);
                    System.out.println("Number of zeros: " + zeroCount);
                }
            }
            
        