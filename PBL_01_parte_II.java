import java.util.Scanner;
import java.util.Random;

class PBLIPartII {
    /* Generate random numbers for the array. */
    public static int[] generateNumbers (int size, Random r){
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = r.nextInt(101);
        }
        return randomNumbers;
    }

    /* Classifies the numbers in the array. */
    public static void classifyNumbers(int[] randomNumbers) {
        for (int randomNumber: randomNumbers) {
            if (randomNumber % 3 == 0) {
                System.out.println(randomNumber + " - Number is a multiple of three.");
            } else if (randomNumber % 2 == 0) {
                System.out.println(randomNumber + " - Even number.");
            } else {
                System.out.println(randomNumber + " - Odd number.");
            }
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Type the size of the list: ");
        int size = s.nextInt();

        Random r = new Random();
        int[] randomNumbers = generateNumbers(size, r);

        classifyNumbers(randomNumbers);
    }
}
