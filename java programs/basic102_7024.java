
            import java.util.Arrays;
            import java.util.Scanner;
            
            public class basic102_7024 {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
            
                    // Get the number of names to sort
                    System.out.println("Enter the number of names to sort: ");
                    int n = scanner.nextInt();
            
                    // Create an array to store the names
                    String[] names = new String[n];
            
                    // Get the names from the user
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter name " + (i + 1) + ": ");
                        names[i] = scanner.nextLine();
                    }
            
                    // Sort the names in alphabetical order
                    Arrays.sort(names);
            
                    // Print the sorted names
                    System.out.println("The sorted names are: ");
                    for (String name : names) {
                        System.out.println(name);
                    }
                }
            }
            
        