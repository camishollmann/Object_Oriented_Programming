// http://bit.ly/3Y2yENo

/*
Crie as classes em Java:
    Classe: Filme
    Atributos: titulo, anoLancamento

Execute a lógica em Java:
    Construa uma lista de Filmes (ArrayList).
    Depois, adicione ao menos 5 filmes à lista.
    No fim, imprima todos os filmes no console.
 */

import java.util.ArrayList;

class Filme {
    private String titulo;
    private short anoLancamento;

    public Filme(String titulo, short anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public String toString() {
        return String.format(
                "<Filme titulo=%s, anoLancamento=%d>",
                this.titulo, this.anoLancamento
        );
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Filme> catalogo = new ArrayList<>();

        Filme filme1 = new Filme("Piratas do Caribe", (short) 2017);
        Filme filme2 = new Filme("Gente Grande", (short) 2014);
        Filme filme3 = new Filme("Wall-E", (short) 2010);
        Filme filme4 = new Filme("Shrek", (short) 2002);
        Filme filme5 = new Filme("Toy Story", (short) 1995);

        catalogo.add(filme1);
        catalogo.add(filme2);
        catalogo.add(filme3);
        catalogo.add(filme4);
        catalogo.add(filme5);

        System.out.println(catalogo);
    }
}

class Rua {
    private String nome;
}

class Cidade {
    private ArrayList<Rua> ruas;
    private String nome;
}

class Pais {
    private ArrayList<Cidade> cidades;
    private String nome;
    public Pais(String nome) {
        this.setNome(nome);
        this.cidades = new ArrayList<Cidade>();
    }
    public void addCidade(Cidade cidade) {
        this.cidades.add(cidade);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
