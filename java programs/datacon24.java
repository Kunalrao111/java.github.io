import java.sql.Timestamp;
import java.util.Date;

public class datacon24 {
    public static void main(String[] args) {
        // Example Timestamp
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        // Convert Timestamp to Date
        Date date = new Date(timestamp.getTime());

        // Display the results
        System.out.println("Original Timestamp: " + timestamp);
        System.out.println("Converted Date: " + date);
    }
}
