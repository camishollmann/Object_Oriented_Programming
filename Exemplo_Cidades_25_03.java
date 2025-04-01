import java.util.ArrayList;

class Rua {
    private String nome;
}

class Cidade {
    private ArrayList<Rua> ruas;
    private String nome;
}
/*
public class Pais {
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
*/