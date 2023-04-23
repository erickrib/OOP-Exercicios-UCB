package Livro;

public class Livro {
    private String nome;
    private double preco;
    private String autor;

    public Livro(String nome, double preco, String autor) {
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", preco=" + preco + ", autor=" + autor + "]";
    }
}
