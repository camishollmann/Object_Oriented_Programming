import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PraticaOrdenacao {
    public static void mostraMenu() {
        System.out.println("(1) Ordenado\n(2) Desordenado\n(9) Sair\n");
        System.out.println("Opcao: ");
    }


    public static void main(String[] args) {
        ArrayList<String> idiomas = new ArrayList<>();

        idiomas.add("Português");
        idiomas.add("Inglês");
        idiomas.add("Japonês");
        idiomas.add("Mandarim");
        idiomas.add("Grego arcaico");

        Scanner teclado = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            mostraMenu();

            int opcao = teclado.nextInt();

            switch(opcao) {
                case 1:
                    ArrayList<String> copia = new ArrayList<>(idiomas);
                    Collections.sort(copia);
                    System.out.println(copia);
                    break;
                case 2:
                    System.out.println(idiomas);
                    break;
                case 9:
                    System.out.println("Saindo do programa");
                    loop = false;
                    break;
            }
        }
    }
}
