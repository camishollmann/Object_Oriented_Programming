public class ContaCorrente extends Conta{
    double taxaManutencao;
    
    public ContaCorrente(String nomeTitular, String numeroConta, double saldo, String dataAbertura, double taxaManutencao){
        super(nomeTitular, numeroConta, saldo, dataAbertura);
        this.taxaManutencao = taxaManutencao;
    }

    public boolean debitarManutencao(){
        if (this.saldo > 0){
            this.saldo -= this.saldo * taxaManutencao;
            return true;
        }
        return false;
    }
}
