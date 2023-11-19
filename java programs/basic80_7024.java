
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            public class basic80_7024 {
            
                public static String removeHtmlTags(String text) {
                    Pattern pattern = Pattern.compile("&lt;[^&gt;]*&gt;");
                    Matcher matcher = pattern.matcher(text);
                    return matcher.replaceAll("");
                }
            
                public static void main(String[] args) {
                    String text = 
                    "This is a test of the HTML tag remover.";
                    String cleanText = removeHtmlTags(text);
                    System.out.println(cleanText);
                }
            }
            
        