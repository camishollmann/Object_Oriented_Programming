/* Date: 2025-03-18. */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedColors {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<String>();

        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Amarelo");

        ArrayList<String> ordenado = new ArrayList<String>(cores);
        Collections.sort(ordenado);

        boolean loop = true;
        while (loop) {
            System.out.println("1 - Ordenado");
            System.out.println("2 - Não Ordenado");
            System.out.println("9 - Sair");

            Scanner s = new Scanner(System.in);

            int opcao = s.nextInt();

            if (opcao == 1) {
                System.out.println(ordenado);
            } else if (opcao == 2) {
                System.out.printlSn(cores);
            } else if (opcao == 9) {
                loop = false;
            }
        }
    }
}

