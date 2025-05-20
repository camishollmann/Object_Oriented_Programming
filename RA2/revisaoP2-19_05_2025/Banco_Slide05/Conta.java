public class Conta {
    String nomeTitular;
    String numeroConta;
    double saldo;
    String dataAbertura;

    public Conta(String nomeTitular, String numeroConta, double saldo, String dataAbertura){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } 
        return false;
    }

    public boolean depositar(double valor){
        if (valor > 0){
            this.saldo +=valor;
        }
        return false;
    }
}
