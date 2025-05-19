public class Imovel{
    String endereco;
    double preco = 1000;

    public Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }

    public String toString(){
        return String.format("Preço: %.2f", this.preco);
    }
}

