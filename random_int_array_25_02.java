import java.util.Scanner;
import java.util.Random;

class RandomIntArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        /* Random is a class that generates numbers from -2.147.487.648
        to  2.147.483.647 (all possible int values).

        You can limit (bound) that with:
        n = r.nextInt(10);
        This generates numbers in the range [0, 9]

        You can also use math expressions for personalized intervals:
        n = r.nexInt(101) - 50;
        This generates numbers in the range [-50, 50]. */

        Random r = new Random();
        int n;

        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            // This will generate in the range [-5, 5]:
            n = r.nextInt(11) - 5;
            array[i] = n;
            System.out.println(array[i]);
        }
    }
}