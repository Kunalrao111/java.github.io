

            import java.time.LocalDateTime;
            import java.time.format.DateTimeFormatter;
            
            public class basic76_7024 {
                public static void main(String[] args) {
                    // Specify the format of the date and time
                    String format = "yyyy-MM-dd HH:mm:ss";
            
                    // Get the current date and time
                    LocalDateTime now = LocalDateTime.now();
            
                    // Format the date and time
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
                    String formattedDateTime = formatter.format(now);
            
                    // Print the formatted date and time
                    System.out.println(formattedDateTime);
                }
            }
            
        