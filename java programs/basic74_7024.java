

            public class basic74_7024 {
                public static String replaceDWithF(String string) {
                    StringBuilder newString = new StringBuilder();
                    for (int i = 0; i < string.length(); i++) {
                        char c = string.charAt(i);
                        if (c == 'd') {
                            newString.append('f');
                        } else {
                            newString.append(c);
                        }
                    }
                    return newString.toString();
                }
            
                public static void main(String[] args) {
                    String string = "This is a test string with the letter d in it.";
                    String newString = replaceDWithF(string);
                    System.out.println(newString);
                }
            }
            
        