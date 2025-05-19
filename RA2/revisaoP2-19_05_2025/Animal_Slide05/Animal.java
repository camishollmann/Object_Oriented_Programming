public class Animal {
    String nome;
    String raca;

    public Animal(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public void caminhar(){
        System.out.println(nome + " caminhou");
    }
}

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

public class Gato extends Animal{
    public Gato(String nome, String raca){
        super(nome, raca);
    }

    public String mia(){
        return "Miau!";
    }
}
public static void main(String[] args){

}