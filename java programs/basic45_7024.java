
            import java.util.Scanner;
    
            public class basic45_7024 {
            
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
            
                    // Get the number of units consumed
                    System.out.print("Enter the number of units consumed: ");
                    int unitsConsumed = scanner.nextInt();
            
                    // Calculate the electricity bill
                    double billAmount = 0.0;
            
                    if (unitsConsumed  <= 100) {
                        billAmount = unitsConsumed * 1.20;
                    } else if (unitsConsumed <= 300) {
                        billAmount = 100 * 1.20 + (unitsConsumed - 100) * 2;
                    } else {
                        billAmount = 100 * 1.20 + 200 * 2 + (unitsConsumed - 300) * 3;
                    }
            
                    // Print the electricity bill amount
                    System.out.println("The electricity bill amount is: ₹" + billAmount);
            
                    scanner.close();
                }
            }
            
        