package matrix;
import java.util.Scanner;

public class summatrix {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        int rows, columns;

	        System.out.print("Enter the number of rows: ");
	        rows = input.nextInt();
	        System.out.print("Enter the number of columns: ");
	        columns = input.nextInt();

	        int[][] matrix1 = new int[rows][columns];
	        int[][] matrix2 = new int[rows][columns];
	        int[][] resultMatrix = new int[rows][columns];

	        System.out.println("Enter matrix 1 elements or use constants : ");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrix1[i][j] = input.nextInt();
	            }
	        }

	        System.out.println("Enter matrix 2 elements or use constants : ");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrix2[i][j] = input.nextInt();
	            }
	        }

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        System.out.println("Matrix 1:");
	        printMatrix(matrix1);
	        System.out.println("Matrix 2:");
	        printMatrix(matrix2);
	        System.out.println("Matrix Sum:");
	        printMatrix(resultMatrix);

	        input.close();
	    }

	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	}

