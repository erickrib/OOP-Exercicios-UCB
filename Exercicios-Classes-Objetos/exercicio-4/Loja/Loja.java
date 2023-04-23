import CD.CD;
import Dvd.DVD;
import Livro.Livro;

public class Loja {
    public static void main(String[] args) {
       Livro livro1 = new Livro("Dom Casmurro", 29.90, "Machado de Assis");
        Livro livro2 = new Livro("O Senhor dos Anéis", 49.90, "J.R.R. Tolkien");
        CD cd1 = new CD("Thriller", 19.90, 9);
        CD cd2 = new CD("Back in Black", 24.90, 10);
        Dvd.DVD dvd1 = new DVD("Star Wars: Episódio IV", 39.90, 120);

        System.out.println("Lista de Produtos:");
        System.out.println("Lista de Produtos:");
        System.out.println("Livros:");
        System.out.println("Nome: " + livro1.getNome() + ", Preço: R$" + livro1.getPreco() + ", Autor: " + livro1.getAutor());
        System.out.println("Nome: " + livro2.getNome() + ", Preço: R$" + livro2.getPreco() + ", Autor: " + livro2.getAutor());
    
        System.out.println("\nCDs:");
        System.out.println("Nome: " + cd1.getNome() + ", Preço: R$" + cd1.getPreco() + ", Número de faixas: " + cd1.getNumFaixas());
        System.out.println("Nome: " + cd2.getNome() + ", Preço: R$" + cd2.getPreco() + ", Número de faixas: " + cd2.getNumFaixas());
    
        System.out.println("\nDVDs:");
        System.out.println("Nome: " + dvd1.getNome() + ", Preço: R$" + dvd1.getPreco() + ", Duração: " + dvd1.getDuracao() + " minutos.");
    }
}
