import java.util.Scanner;

public class basic139_7024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float value: ");
        float number = scanner.nextFloat();

        float roundedValue = Math.round(number * 100) / 100.0f;
        System.out.println("Rounded value: " + roundedValue);
    }
}