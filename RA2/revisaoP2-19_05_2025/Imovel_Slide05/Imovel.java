public class Imovel{
    String endereco;
    double preco;

    public Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }

    public String toString(){
        return String.format("Preço: %.2f", this.preco);
    }
}

public class ImovelVelho extends Imovel{
    public ImovelVelho(String endereco, double preco){
        super(endereco, preco);
    }
}

public class ImovelNovo extends Imovel{
    
}
