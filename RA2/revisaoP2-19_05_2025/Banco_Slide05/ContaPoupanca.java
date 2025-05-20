class ContaPoupanca extends Conta{
    private double taxaRendimento;

    public ContaPoupanca(String nomeTitular, String numeroConta, double saldo, String dataAbertura, double taxaRendimento){
        super(nomeTitular, numeroConta, saldo, dataAbertura);
        this.taxaRendimento = taxaRendimento;
    }

    public boolean debitarRendimento(){
        if (this.saldo > 0){
            this.saldo -= this.saldo * taxaRendimento;
            return true;
        }
        return false;
    }
}
