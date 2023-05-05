public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("José", "Rua C, 789", "987654321", 2000, "54321", 10000, 5);
        System.out.println("Operario:");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Salário: " + operario.getSalario());
        System.out.println("Matrícula: " + operario.getMatricula());
        System.out.println("Valor produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao());
        System.out.println("Salário com comissão: " + operario.calcularSalario());
    }
}
