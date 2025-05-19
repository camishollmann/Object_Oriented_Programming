import java.util.ArrayList;
import java.util.Scanner;

public class PBL03b_II{
    public static void main(String[] args){
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        boolean loop = true;
        int opcao;    
        String nome;
        String senha;

        while (loop){
            Scanner s = new Scanner(System.in);
            boolean usuario_existe = false;


            System.out.println("Bem-vindo!\n1 - Autenticar\n2 - Criar usuário\n3 - Sair");
            opcao = s.nextInt();
            s.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Digite o nome de usuário:");
                    nome = s.nextLine();

                    System.out.println("Digite a senha:");
                    senha = s.nextLine();

                    for (Usuario usuario : listaUsuarios){
                        if (usuario.getNome().equals(nome) && usuario.validarSenha(senha)){
                            System.out.println("Seja bem-vindo " + nome);
                            usuario_existe = true;
                            break;
                        }
                    }
                    if(!usuario_existe){
                        System.out.println("Usuário ou senha incorretos.");
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do usuário:");
                    nome = s.nextLine();

                    System.out.println("Digite a senha:");
                    senha = s.nextLine();

                    for(Usuario usuario : listaUsuarios){
                        if (usuario.getNome().equals(nome)){ // Comparação de Strings PRECISA de MÉTODO EQUALS().
                            System.out.println("Usuário " + nome + " já existe.");
                            usuario_existe = true;
                            loop = false;
                            break;
                        }
                    }
                    if (!usuario_existe){
                        listaUsuarios.add(new Usuario(nome, senha));
                        System.out.println("Usuário: " + nome + " criado com sucesso!");
                        break;
                    }
                case 3:
                System.out.println("Saindo");
                loop = false;
                break;
            }
        }
    }
}
