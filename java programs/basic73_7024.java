
            public class basic73_7024 {
                public static String getSubstring(String str,int startIndex,int endIndex) {
                    return str.substring(startIndex, endIndex + 1);
                }
            
                public static void main(String[] args) {
                    String str = "Hello, World!";
                    int startIndex = 0;
                    int endIndex = 4;
            
                    String substring = getSubstring(str, startIndex, endIndex);
            
                    System.out.println(substring);
                }
            }
            
        