import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private int idade;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
        this.idade = calculaIdade(LocalDate.now());
    }

    public int calculaIdade(LocalDate dataAtual) {
        Period periodo = Period.between(this.dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public void informaIdade() {
        System.out.println("A idade de " + this.nome + " é " + this.idade + " anos.");
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", idade=" + idade + "]";
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.dataNascimento = LocalDate.of(ano, mes, dia);
        this.idade = calculaIdade(LocalDate.now());
    }
}
