import java.util.Scanner;

public class FaturaTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da fatura: ");
        String numero = scanner.nextLine();

        System.out.print("Digite a descrição da fatura: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço por item: ");
        double preco = scanner.nextDouble();

        Fatura fatura = new Fatura(numero, descricao, quantidade, preco);

        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: " + fatura.getPreco());
        System.out.println("Total da fatura: " + fatura.getTotalFatura());
    }
}
