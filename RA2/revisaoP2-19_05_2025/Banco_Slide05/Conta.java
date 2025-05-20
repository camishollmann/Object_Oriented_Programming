public class Conta {
    String nomeTitular;
    String numeroConta;
    double saldo;
    String dataAbertura;

    public Conta(String nomeTitular, String numeroConta, double saldo){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if (this.saldo > 0 && valor < saldo){

        } 
    }

    public boolean depositar(double valor){

    }
}
