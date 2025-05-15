/* Date: 2025-03-11. */
import java.util.Scanner;
import java.util.Random;

class DinamicMat {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the number of rows: ");
        int rows = keyboard.nextInt();

        System.out.println("Type the number of columns: ");
        int columns = keyboard.nextInt();

        Random r = new Random();
        int n;

        /* Filling out the matrix with random numbers. */
        double[][] randomNumbers = new double[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                n = r.nextInt(100);
                randomNumbers[i][j] = n;
            }
        }
        /* Printing the matrix. "\t" is a "tab" for horizontal tabulation. */
        for(double[] line : randomNumbers){
            for (double vertical : line) {
                System.out.printf("%.4f\t", vertical);
            }
            System.out.println();
        }
        /* Adding rows:
        * [ 4 5 6 ] -> 15
        * [ 7 8 9 ] -> 24
        */
        for (int i = 0; i < rows; i++){
            double sum = 0.0;
            for (int j = 0; j < columns; j++){
                sum += randomNumbers[i][j];
            }
            System.out.printf("Row %d: %.4f\n", i, sum);
        }
        /* Adding columns
        * [ 4 5 6 ]
        * [ 7 8 9 ]
        * 11 13 15
        */
        for (int j = 0; j < columns; j++){
            double sum = 0.0;
            for (int i = 0; i < rows; i++){
                sum += randomNumbers[i][j];
            }
            System.out.printf("Column %d: %.4f\n", j, sum);
        }
    }
}