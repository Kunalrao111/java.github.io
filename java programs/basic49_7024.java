
            public class basic49_7024 {
    
                public static double calculateCommissionPercentage
                (double salesAmount, double commissionRate) {
                    return (salesAmount * commissionRate) / 100;
                }
            
                public static void main(String[] args) {
                    double salesAmount = 10000;
                    double commissionRate = 10;
            
                    double commissionPercentage = calculateCommissionPercentage
                    (salesAmount, commissionRate);
            
                    System.out.println("The commission percentage is: " 
                    + commissionPercentage);
                }
            }
            
        