public class MercadoImoveis {
    public static void main(String[] args){
        ImovelNovo casa1 = new ImovelNovo("rua x", 1000);
        ImovelVelho casa2 = new ImovelVelho("rua y", 1000);
        
        System.out.println(casa1.getAcrescimo());
        System.out.println(casa2.getDesconto());
        System.out.println(casa1);
    }    
}
