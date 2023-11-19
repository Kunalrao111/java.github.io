
            import java.util.Scanner;
    
            public class basic56_7024 {
                public static void main(String[] args) {
                    // Get the year from the user
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the year: ");
                    int year = scanner.nextInt();
            
                    // Check if the year is a leap year
                    boolean isLeapYear = false;
                    if (year % 4 == 0) {
                        if (year % 100 != 0 || year % 400 == 0) {
                            isLeapYear = true;
                        }
                    }
            
                    // Print whether the year is a leap year or not
                    if (isLeapYear) {
                        System.out.println(year + " is a leap year.");
                    } else {
                        System.out.println(year + " is not a leap year.");
                    }
                }
            }
            
        