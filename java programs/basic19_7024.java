
            public class basic19_7024 {
                public static void main(String[] args) {
                    // Declare a variable to store the number of seconds
                    int seconds = 3600;
            
                    // Calculate the hours, minutes, and seconds
                    int hours = seconds / 3600;
                    int minutes = (seconds % 3600) / 60;
                    int remainingSeconds = seconds % 60;
            
                    // Print the results to the console
                    System.out.println("Hours: " + hours);
                    System.out.println("Minutes: " + minutes);
                    System.out.println("Seconds: " + remainingSeconds);
                }
            }
            
        