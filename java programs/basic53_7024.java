
            import java.util.Scanner;
    
            public class basic53_7024 {
                public static void main(String[] args) {
                    // Get the month and year from the user
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the month: ");
                    int month = scanner.nextInt();
                    System.out.println("Enter the year: ");
                    int year = scanner.nextInt();
            
                    // Check if the year is a leap year
                    boolean isLeapYear = false;
                    if (year % 4 == 0) {
                        if (year % 100 != 0 || year % 400 == 0) {
                            isLeapYear = true;
                        }
                    }
            
                    // Determine the number of days in the month
                    int numberOfDays = 0;
                    switch (month) {
                        case 1:
                            numberOfDays = 31;
                            break;
                        case 2:
                            if (isLeapYear) {
                                numberOfDays = 29;
                            } else {
                                numberOfDays = 28;
                            }
                            break;
                        case 3:
                            numberOfDays = 31;
                            break;
                        case 4:
                            numberOfDays = 30;
                            break;
                        case 5:
                            numberOfDays = 31;
                            break;
                        case 6:
                            numberOfDays = 30;
                            break;
                        case 7:
                            numberOfDays = 31;
                            break;
                        case 8:
                            numberOfDays = 31;
                            break;
                        case 9:
                            numberOfDays = 30;
                            break;
                        case 10:
                            numberOfDays = 31;
                            break;
                        case 11:
                            numberOfDays = 30;
                            break;
                        case 12:
                            numberOfDays = 31;
                            break;
                        default:
                            System.out.println("Invalid month!");
                            break;
                    }
            
                    // Print the number of days in the month
                    System.out.println
                    ("The number of days in the month is: " + numberOfDays);
                }
            }
            
        