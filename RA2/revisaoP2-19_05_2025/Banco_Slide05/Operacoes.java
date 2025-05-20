import java.util.ArrayList; 

public class Operacoes {
    public static void main(String[] args){
        Banco b = new Banco("Ricos");

        b.adicionarConta(new ContaCorrente("Miguel", "1000", 18.00, "08/04/25", 0.05));
        b.adicionarConta(new ContaPoupanca("Eduardo Machado", "1001", 3.14, "08/04/25", 0.01));
    }
}
