public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("José", "Rua C, 789", "321654987", 1500, "67890", 5000, 0.1);
        System.out.println("Vendedor:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Salário: " + vendedor.getSalario());
        System.out.println("Matrícula: " + vendedor.getMatricula());
        System.out.println("Valor de vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao());
        System.out.println("Salário com INSS: " + vendedor.calcularSalario());
    }
}