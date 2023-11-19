
            public class basic12_7024{
    
                public static void main(String[] args) {
                    String string = "This is a test string.";
            
                    // Initialize the counters
                    int letters = 0;
                    int spaces = 0;
                    int numbers = 0;
                    int other = 0;
            
                    // Iterate over the characters in the string
                    for (char character : string.toCharArray()) {
                        if (Character.isLetter(character)) {
                            letters++;
                        } else if (Character.isSpaceChar(character)) {
                            spaces++;
                        } else if (Character.isDigit(character)) {
                            numbers++;
                        } else {
                            other++;
                        }
                    }
            
                    // Print the results
                    System.out.println("Letters: " + letters);
                    System.out.println("Spaces: " + spaces);
                    System.out.println("Numbers: " + numbers);
                    System.out.println("Other: " + other);
                }
            }
            
        