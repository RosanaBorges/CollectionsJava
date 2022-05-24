package Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*Com dados de minhas séries favoritas, crie um conjuto e ordene o conjunto exibindo:
nome - genero - tempo de episódio;

Série1: Big Bang Theory, genero: Comédia, tempoEpisodio: 22
Série2: The Office, genero: comédia, tempoEpisodio: 40
Série3: Workin' Moms, genero: Comédia dramática, tempoEpisodio: 20
 */
public class OrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem Aleatória\t--");
        Set<Series> minhasSeries = new HashSet<>(){{
            add(new Series( "Big Bang Theory","comédia",22 ));
            add(new Series( "The Office","comédia",40));
            add(new Series( "Workin' Moms","comédia dramática",20 ));
        }};
        for(Series series: minhasSeries) System.out.println(series.getNome()+ " - " + series.getGenero() + " - " + series.getTempoEpisodio());

        System.out.println("--\tOrdem Natural por tempo de episódio\t--");
        Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries);
        System.out.println(minhasSeries2);
    }
}

class Series implements Comparable<Series>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return nome.equals(series.nome) && genero.equals(series.genero) && tempoEpisodio.equals(series.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Series series) {
        return Integer.compare(this.getTempoEpisodio(), series.getTempoEpisodio());
    }
}
