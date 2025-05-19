public class Cachorro extends Animal{
    boolean morde;
    public Cachorro(String nome, String raca, boolean morde){
        super(nome, raca);
        this.morde = morde;
    }

    public String late(){
        return "Au au!";
    }
}
