package Dvd;

public class DVD {
    private String nome;
    private double preco;
    private int duracao;

    public DVD(String nome, double preco, int duracao) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "DVD [nome=" + nome + ", preco=" + preco + ", duracao=" + duracao + "]";
    }
}
