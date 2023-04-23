package CD;

public class CD {
    private String nome;
    private double preco;
    private int numFaixas;

    public CD(String nome, double preco, int numFaixas) {
        this.nome = nome;
        this.preco = preco;
        this.numFaixas = numFaixas;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    @Override
    public String toString() {
        return "CD [nome=" + nome + ", preco=" + preco + ", numFaixas=" + numFaixas + "]";
    }
}
