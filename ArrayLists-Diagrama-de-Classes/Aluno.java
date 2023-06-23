import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private Curso curso;
    private List<Double> notas;

    public Aluno() {
        notas = new ArrayList<>();
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Média: " + calcularMedia());
    }
}

