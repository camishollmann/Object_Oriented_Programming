public class Usuario{
    private String nome;
    private String senha;

    Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }
    
    public boolean validarSenha(String senhaRecebida){
        if (senha.equals(senhaRecebida)){
            return true;
        }
        return false;
    }
}