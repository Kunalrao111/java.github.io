import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datacon9 {
    public static void main(String[] args) {
        String dateString = "2023-11-17";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(dateString);
            System.out.println(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}