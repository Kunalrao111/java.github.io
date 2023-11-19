

            public class basic78_7024 {
                public static String removeChar(String str, char ch) {
                    String newStr = "";
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) != ch) {
                            newStr += str.charAt(i);
                        }
                    }
                    return newStr;
                }
            
                public static void main(String[] args) {
                    String str = "Hello world";
                    char ch = 'o';
            
                    String newStr = removeChar(str, ch);
            
                    System.out.println(newStr);
                }
            }
            
        