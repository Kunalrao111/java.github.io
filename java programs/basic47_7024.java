
            public class basic47_7024 {
                public static void main(String[] args) {
                    // Get the principal amount, interest rate, and time period
                    double principalAmount = 10000;
                    double interestRate = 5.0;
                    int timePeriod = 5;
            
                    // Calculate the compound interest
                    double compoundInterest = 
                    principalAmount * Math.pow((1 + interestRate / 100), timePeriod) - principalAmount;
            
                    // Print the compound interest
                    System.out.println("The compound interest is: " + compoundInterest);
                }
            }
            
        