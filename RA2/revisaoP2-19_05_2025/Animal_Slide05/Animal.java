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