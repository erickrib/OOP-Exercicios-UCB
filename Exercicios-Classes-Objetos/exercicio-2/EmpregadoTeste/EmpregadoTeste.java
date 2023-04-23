package EmpregadoTeste;

import Empregado.Empregado;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Pedro", "Silva", 2000.0);
        Empregado empregado2 = new Empregado("Erick", "Rocha", 2500.0);

        System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " + empregado1.getSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " + empregado2.getSalarioAnual());

        empregado1.aumentarSalario(10);
        empregado2.aumentarSalario(10);

        System.out.println("Novo salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " + empregado1.getSalarioAnual());
        System.out.println("Novo salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " + empregado2.getSalarioAnual());
    }
}
