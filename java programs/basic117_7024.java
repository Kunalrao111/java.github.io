
            import java.util.Scanner;
    
            public class basic117_7024 {
                public static void main(String[] args) {
                    // Get the amount from the user
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the amount: ");
                    int amount = scanner.nextInt();
            
                    // Declare an array to store the denominations of the notes
                    int[] notes = {2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    
                    int[] noteCounter = new int[notes.length];
            
                    for (int i = 0; i < notes.length; i++) {
                        if (amount >= notes[i]) {
                            noteCounter[i] = amount / notes[i];
                            amount = amount % notes[i];
                        }
                    }
            
                    // Print the total number of notes of each denomination
                    System.out.println
                    ("The total number of notes of each denomination is:");
                    for (int i = 0; i < notes.length; i++) {
                        if (noteCounter[i] != 0) {
                            System.out.println(notes[i] + ": " + noteCounter[i]);
                        }
                    }
                }
            }
            
        