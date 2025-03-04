import java.util.Scanner;
class FinalValueK {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor máximo para k: ");
        int n = teclado.nextInt();

        int k;

        for(k = 2; k < n - 2; k += 3);
        System.out.println("Valor final de k: " + k);
        /* Max value will be 8 for values in the range of [8, 10]
        and 11 for n = 11. */
    }
} 