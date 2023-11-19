
            import java.text.DecimalFormat;
    
            public class basic134_7024 {
                public static float round(float number, int decimalPlaces) {
                    DecimalFormat df = new DecimalFormat("#.##");
                    String formattedNumber = df.format(number);
            
                    return Float.parseFloat(formattedNumber);
                }
            
                public static void main(String[] args) {
                    float number = 123.456789f;
                    int decimalPlaces = 2;
            
                    float roundedNumber = round(number, decimalPlaces);
            
                    System.out.println("The rounded number is: " + roundedNumber);
                }
            }
            
        