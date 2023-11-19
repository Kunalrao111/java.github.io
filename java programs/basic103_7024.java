
            import java.util.Scanner;
    
            public class basic103_7024 {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
            
                    System.out.println
                    ("Enter the number of rows and columns of the matrix: ");
                    int rows = scanner.nextInt();
                    int columns = scanner.nextInt();
            
                    int[][] originalMatrix = new int[rows][columns];
                    int[][] transposeMatrix = new int[columns][rows];
            
                    System.out.println("Enter the elements of the matrix: ");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            originalMatrix[i][j] = scanner.nextInt();
                        }
                    }
            
                    // Transpose the matrix.
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            transposeMatrix[j][i] = originalMatrix[i][j];
                        }
                    }
            
                    // Print the transpose matrix.
                    System.out.println("The transpose of the matrix is: ");
                    for (int i = 0; i < columns; i++) {
                        for (int j = 0; j < rows; j++) {
                            System.out.print(transposeMatrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
            }
            
        