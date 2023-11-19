
            import java.util.Scanner;
    
            public class basic105_7024 {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
            
                    // Get the number of subjects
                    System.out.println("Enter the number of subjects: ");
                    int numSubjects = sc.nextInt();
            
                    // Create an array to store the marks
                    int[] marks = new int[numSubjects];
            
                    // Get the marks of each subject
                    for (int i = 0; i < numSubjects; i++) {
                        System.out.println
                        ("Enter the marks for subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }
            
                    // Calculate the total marks
                    int totalMarks = 0;
                    for (int mark : marks) {
                        totalMarks += mark;
                    }
            
                    // Calculate the percentage
                    float percentage = (totalMarks / (float) numSubjects) * 100;
            
                    // Display the total marks and percentage
                    System.out.println("Total marks: " + totalMarks);
                    System.out.println("Percentage: " + percentage);
                }
            }
            
        