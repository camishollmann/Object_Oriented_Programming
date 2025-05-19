public class ImovelNovo extends Imovel{
    public ImovelNovo(String endereco, double preco){
        super(endereco, preco);
    }

    public double getAcrescimo(){
        return this.preco * 1.1;
    }
}