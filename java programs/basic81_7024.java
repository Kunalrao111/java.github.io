

            public class basic81_7024 {
                public static int countLines(String s) {
                    int count = 0;
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == '\n') {
                            count++;
                        }
                    }
                    return count;
                }
            
                public static void main(String[] args) {
                    String s = "This is a string with multiple lines.\nThis is the second line.\nThis is the third line.";
                    int lineCount = countLines(s);
                    System.out.println("The total number of lines in the string is: " + lineCount);
                }
            }
            
        