import java.util.ArrayList;

class Filme {
    private String titulo;
    private short anoLancamento;

    Filme(String titulo, short anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }
    public String toString() {
        return String.format("<Filme titulo=%s, anoLancamento=%d", this.titulo, this.anoLancamento);
    }
}

class Principal {
    public static void main(String[] args) {
        ArrayList<Filme> catalogo = new ArrayList<>();

        Filme filme1 = new Filme("Piratas do Caribe", (short) 2017);
        Filme filme2 = new Filme("Gente Grande", (short) 2014);
        Filme filme3 = new Filme("Wall-E", (short) 2010);
        Filme filme4 = new Filme("Shrek", (short) 2002);
        Filme filme5 = new Filme("Toy Story", (short) 1995);

        catalogo.add(fi1me1);
        catalogo.add(filme2);
        catalogo.add(filme3);
        catalogo.add(filme4);
        catalogo.add(filme5);

        System.out.println(catalogo);

    }
}