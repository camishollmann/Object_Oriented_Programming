public class ImovelNovo extends Imovel{
    public ImovelNovo(String endereco, double preco){
        super(endereco, preco);
    }

    public void getAcrescimo(){
        this.preco = preco * 1.1;
    }
}