public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30, "Masculino");
        System.out.println(pessoa);

        Empregado empregado = new Empregado("Maria", 25, "Feminino", 2000.0, "123456");
        System.out.println(empregado);
        System.out.println("Valor do INSS: R$" + empregado.valorInss());

        Gerente gerente = new Gerente("José", 35, "Masculino", 5000.0, "654321", "Vendas");
        System.out.println(gerente);
        System.out.println("Valor do INSS: R$" + gerente.valorInss());

        Vendedor vendedor = new Vendedor( "Ana", 20, "Feminino", 1500.0, "987654", 10000.0, 10);
        System.out.println(vendedor);
        System.out.println("Valor do INSS: R$" + vendedor.valorInss());

        Cliente cliente = new Cliente("Carlos", 50, "Masculino", 10000.0, 1970);
        System.out.println(cliente);
    }
}
