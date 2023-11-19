
            import java.util.Scanner;
    
            public class basic68_7024 {
                public static void main(String[] args) {
                    // Get the two numbers and the operator from the user
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the first number: ");
                    double firstNumber = scanner.nextDouble();
                    System.out.println("Enter the operator (+, -, *, or /): ");
                    char operator = scanner.next().charAt(0);
                    System.out.println("Enter the second number: ");
                    double secondNumber = scanner.nextDouble();
            
                    // Perform the operation
                    double result = 0.0;
                    switch (operator) {
                        case '+':
                            result = firstNumber + secondNumber;
                            break;
                        case '-':
                            result = firstNumber - secondNumber;
                            break;
                        case '*':
                            result = firstNumber * secondNumber;
                            break;
                        case '/':
                            result = firstNumber / secondNumber;
                            break;
                        default:
                            System.out.println("Invalid operator!");
                            break;
                    }
            
                    // Print the result
                    System.out.println("The result is: " + result);
                }
            }
            
        