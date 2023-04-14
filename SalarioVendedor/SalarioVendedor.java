import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numCarros = sc.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorVendas = sc.nextDouble();

        System.out.print("Digite o salário fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite o valor recebido por carro vendido: ");
        double valorPorCarro = sc.nextDouble();

        double comissaoFixa = numCarros * valorPorCarro;
        double comissaoPercentual = 0.05 * valorVendas;
        double salarioFinal = salarioFixo + comissaoFixa + comissaoPercentual;

        System.out.printf("Salário final do vendedor: R$ %.2f%n", salarioFinal);

        sc.close();
    }
}
