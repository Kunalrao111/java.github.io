

            import java.util.Scanner;
    
            public class basic92_7024 {
                public static void main(String[] args) {
                    // Get the size of the matrices
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the number of rows of the matrices: ");
                    int rows = sc.nextInt();
                    System.out.println("Enter the number of columns of the matrices: ");
                    int columns = sc.nextInt();
            
                    // Create two matrices
                    int[][] matrix1 = new int[rows][columns];
                    int[][] matrix2 = new int[rows][columns];
            
                    // Input the elements of the first matrix
                    System.out.println("Enter the elements of the first matrix: ");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            matrix1[i][j] = sc.nextInt();
                        }
                    }
            
                    // Input the elements of the second matrix
                    System.out.println("Enter the elements of the second matrix: ");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            matrix2[i][j] = sc.nextInt();
                        }
                    }
            
                    // Create a new matrix to store the sum of the two matrices
                    int[][] sumMatrix = new int[rows][columns];
            
                    // Add the two matrices
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                        }
                    }
            
                    // Print the sum matrix
                    System.out.println("The sum of the two matrices is: ");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            System.out.print(sumMatrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
            }
            
        