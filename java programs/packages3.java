
import java.util.Date;

public class packages3 {
    private Date date;

    public packages3() {
        date = new Date();
    }

    public Date getCurrentDate() {
        return date;
    }

    public static void main(String[] args) {
        packages3 customDate = new packages3();
        Date currentDate = customDate.getCurrentDate();

        System.out.println("Current Date: " + currentDate);
    }
}
