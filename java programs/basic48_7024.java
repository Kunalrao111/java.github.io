
            public class basic48_7024 {
    
                public static double calculateBattingAverage(int hits, int atBats) {
                    if (atBats == 0) {
                    throw new IllegalArgumentException
                    ("Number of at-bats cannot be zero.");
                    }
                    return (double) hits / atBats;
                }
            
                public static void main(String[] args) {
                    int hits = 100;
                    int atBats = 200;
            
                    double battingAverage = calculateBattingAverage(hits, atBats);
            
                    System.out.println("The batting average is: " + battingAverage);
                }
            }
            
        