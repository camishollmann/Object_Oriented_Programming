/* Date: 2025-03-11. */
class Pessoa {
    String nome;
    float peso;
    float altura;
    int idade;
    boolean comSono;
    boolean comFome;

    public Pessoa(String nome, int idade, float peso, float altura, boolean comSono, boolean comFome){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.comSono = comSono;
        this.comFome = comFome;
    }

    void comer() {}

    void falar() {}

    void pensar() {}
}
class Inicio {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Pedro", 19, 0.0f, 1.69f, true, false);
        Pessoa p2 = new Pessoa("Mark", 34, 70, 1.78f, true, true);
    }
}