import java.util.ArrayList;

public class Banco {
   private String nome;
   private ArrayList<Conta> contas;

   public Banco(String nome){
      this.nome = nome;
      this.contas = new ArrayList<>();
   }
    
   public void adicionarConta(Conta conta){
      this.contas.add(conta);
   }
}
