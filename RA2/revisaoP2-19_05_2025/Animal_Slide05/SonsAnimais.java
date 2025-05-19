public class SonsAnimais {
    public static void main(String[] args){
        Gato gato1 = new Gato("Tom", "Persa");
        Cachorro cachorro1 = new Cachorro("Farofa", "Vira-latas", false);

        System.out.println(cachorro1.nome + " diz " + cachorro1.late());
        System.out.println(gato1.nome + " diz " + gato1.mia());
    }
}