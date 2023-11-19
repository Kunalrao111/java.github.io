

            import java.util.Scanner;
    
            public class basic67_7024 {
            
                public static void main(String[] args) {
            
                    // Create a Scanner object to read user input
                    Scanner scanner = new Scanner(System.in);
            
                    // Prompt the user to enter the student's score
                    System.out.println("Enter the student's score: ");
                    double score = scanner.nextDouble();
            
                    // Calculate the student's grade
                    String grade;
                    if (score >= 90) {
                        grade = "A";
                    } else if (score >= 80) {
                        grade = "B";
                    } else if (score >= 70) {
                        grade = "C";
                    } else if (score >= 60) {
                        grade = "D";
                    } else {
                        grade = "F";
                    }
            
                    // Print the student's grade to the console
                    System.out.println("The student's grade is: " + grade);
                }
            }
            
        