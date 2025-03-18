import java.util.Scanner;
/*
class Usuario {
    String nome;

}
*/
class PBl03b{
    public static void main(String args[]) {
        boolean loop = true;
        while (loop) {
            System.out.println("Bem-vindo!\t");
            System.out.println("1 - Autenticar\t");
            System.out.println("2 - Criar usuario\t");
            System.out.println("3 - Sair\t");
            
            String usuarios[] = new String[100];
            
            Scanner t = new Scanner(System.in);
            int opcao = t.nextInt();

            String nome;
            boolean usuario_existe = false;
            String senha;

             if (opcao == 1) {
                 System.out.println("Digite o nome do usuario: ");
                 nome = t.next();

                 System.out.println("Digite a senha: ");
                 senha = t.next();

                 int i = 0;
                 while (i <= 100) {
                     if (usuarios[i] != null && i <= 100 - 2) {
                         if (nome == usuarios[i] && senha == usuarios[i + 1]) {
                             System.out.println("Seja bem-vindo!");
                             usuario_existe = true;
                             loop = false;
                         } else {
                             usuario_existe = false;
                             System.out.println("Usuario ou senha incorretos.");
                         }
                         i++;
                     }
                 }
             } else if (opcao == 2) {
                 System.out.println("Digite o nome de usuario: ");
                 nome = t.next();

                 System.out.println("Digite a senha: ");
                 senha = t.next();

                 for (int i = 0; i > 100; i++) {
                    if (usuarios[i] == nome) {
                        System.out.println("Usuario nome ja existe.");
                        usuario_existe = true;
                        loop = false;
                    }
                 }

                 int i = 0;

                 while (usuarios[i] != null && i < 100 - 2) {
                     i++;
                 }
                 usuarios[i] = nome;
                 usuarios[i + 1] = senha;
             } else if (opcao == 3) {
                 System.out.println("Saindo");
                 loop = false;
             } else {
                 System.out.println("Opcao invalida. A opcao nao existe.");
             }
        }
    }
}