public class ImovelVelho extends Imovel{
    public ImovelVelho(String endereco, double preco){
        super(endereco, preco);
    }

    public void getDesconto(){
        this.preco = preco * 0.9;
    }
}
