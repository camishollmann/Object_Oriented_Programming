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

        double[][] randomNumbers = new double[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                n = r.nextInt(100);
                randomNumbers[i][j] = n;
                System.out.printf("%.2f ", randomNumbers[i][j]);
            }
        }
    }
}