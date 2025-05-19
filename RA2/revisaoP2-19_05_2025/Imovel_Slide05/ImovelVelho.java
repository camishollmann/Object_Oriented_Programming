public class ImovelVelho extends Imovel{
    public ImovelVelho(String endereco, double preco){
        super(endereco, preco);
    }

    public double getDesconto(){
        return this.preco * 0.9;
    }
}
