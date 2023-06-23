import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private String titulacao;
    private double salario;
    private List<Curso> cursos;

    public Professor() {
        cursos = new ArrayList<>();
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Titulação: " + titulacao);
        System.out.println("Salário: " + salario);
        System.out.println("Cursos lecionados: ");
        for (Curso curso : cursos) {
            curso.imprimirCurso();
        }
    }
}
