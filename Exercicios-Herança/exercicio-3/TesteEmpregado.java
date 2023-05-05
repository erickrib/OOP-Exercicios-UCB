public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", "Rua A, 123", "123456789", 2000, "12345");
        System.out.println("Empregado:");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Salário: " + empregado.getSalario());
        System.out.println("Matrícula: " + empregado.getMatricula());
        System.out.println("Salário com INSS: " + empregado.calcularSalario());

        Administrador administrador = new Administrador("Maria", "Rua B, 456", "987654321", 3000, "54321", 1000);
        System.out.println("\nAdministrador:");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Salário: " + administrador.getSalario());
        System.out.println("Matrícula: " + administrador.getMatricula());
        System.out.println("Ajuda de custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário com INSS: " + administrador.calcularSalario());
    }
}
