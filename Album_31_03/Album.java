/* Date: 31/03/2025. */
import java.util.Scanner;
import java.util.ArrayList;

public class Album {
    private String genero;
    private String nomeAlbum;
    private String artista;
    private int ano;
    private String[] musica = new String[5]; // Uma musica por campo.

    Album(String genero, String nomeAlbum, String artista, int ano, String[] musica) {
         this.genero = genero;
         this.nomeAlbum = nomeAlbum;
         this.artista = artista;
         this.ano = ano;
         this.musica = musica;
    }

    public String toString() {
        String resultado = String.format(
                "Gênero: %s%nÁlbum: %s%nArtitsta: %s%nAno: %d%nMúsicas:%n",
                genero, nomeAlbum, artista, ano
        );
        for (String m : musica) {
            resultado += String.format("- %s%n", m);
        }
        return resultado;
    }
}

class addMusicas{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String[] musicas = new String[5];

        System.out.println("Digite 5 músicas para o álbum: ");
        for (int i = 0; i < musicas.length; i++) {
            System.out.println("Música " + (i + 1) + ": ");
            musicas[i] = s.nextLine();
        }

        Album album1 = new Album("Pop", "Gorillaz", "Gorillaz", 2001, musicas);

        System.out.println(album1);
    }
}