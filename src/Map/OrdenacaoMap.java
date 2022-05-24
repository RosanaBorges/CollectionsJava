package Map;
/*
Livros favoritos
Crie um dicionário e ordeno o dicionário exibindo:
Nome livro e qtdePag

Autor:Gayle Laakmann McDowell , Livro:Cracking the Coding Interview , QtdePag:708
Autor:Robert Cecil Martin , Livro:Clean Code , QtdePag:456
Autor:Juliana Vermelho, Esteves , Livro:Mamãe tá Careca  , QtdePag:80
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--/tOrdem Aleatória:/t--");
        Map <String, Livros> meusLivros = new HashMap<>(){{
            put("Gayle Laakmann McDowell", new Livros("Cracking the Coding Interview", 708));
            put("Robert Cecil Martin", new Livros("Clean Code", 456));
            put("Juliana Vermelho, Esteves", new Livros("Mamãe tá Careca", 80));
        }};
        for (Map.Entry<String, Livros>:meusLivros.entrySet());
        System.out.println(livros.get() + "-" + meusLivros.getValue);


    }
}

class Livros{
   private String livro;
   private Integer paginas;

    public Livros(String livro, Integer paginas) {
        this.livro = livro;
        this.paginas = paginas;
    }
    public String getLivro() {
        return livro;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return livro.equals(livros.livro) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livro, paginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                ", livro='" + livro + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}