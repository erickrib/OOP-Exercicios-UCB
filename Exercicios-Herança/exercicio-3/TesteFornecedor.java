public class TesteFornecedor {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("João", "Rua A, 123", "1234-5678", 1000.0, 500.0);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor do crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor da dívida: " + fornecedor.getValorDivida());

        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}
