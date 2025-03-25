import java.util.Scanner;
/*
class Usuario {
    String nome;

}
*/
class PBL03b_I {
    public static void main(String args[]) {
        boolean loop = true;
        String usuarios[] = new String[100]; // Deve ser declarado fora para nao ser perdido.

        while (loop) {
            System.out.println("Bem-vindo!\t");
            System.out.println("1 - Autenticar\t");
            System.out.println("2 - Criar usuario\t");
            System.out.println("3 - Sair\t");

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
                 boolean autenticado = false;
                 while (i <= 100 - 2 && usuarios[i] != null) {
                     if (nome.equals(usuarios[i]) && senha.equals(usuarios[i + 1])) {
                         System.out.println("Seja bem-vindo!");
                         usuario_existe = true;
                         loop = false;
                     }
                 i += 2; // Avanca para o proximo par [nome, senha].
                 }

                 if (!usuario_existe){
                     System.out.println("Usuario ou senha incorretos.");
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