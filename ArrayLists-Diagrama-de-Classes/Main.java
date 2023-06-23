import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes
        Telefone telefone1 = new Telefone();
        telefone1.setTipo("Celular");
        telefone1.setDdd("11");
        telefone1.setNumero("999999999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Residencial");
        telefone2.setDdd("11");
        telefone2.setNumero("888888888");

        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setCPF("123456789");
        aluno.setEmail("joao@gmail.com");
        aluno.adicionarTelefone(telefone1);
        aluno.adicionarTelefone(telefone2);

        Curso curso = new Curso();
        curso.setNome("Engenharia de Software");
        aluno.setCurso(curso);

        List<Double> notas = new ArrayList<>();
        notas.add(7.5);
        notas.add(8.0);
        notas.add(9.5);
        aluno.setNotas(notas);

        aluno.imprimir();

        Professor professor = new Professor();
        professor.setNome("Maria");
        professor.setCPF("987654321");
        professor.setEmail("maria@gmail.com");
        professor.setTitulacao("Doutorado");
        professor.setSalario(5000.0);

        List<Curso> cursosProfessor = new ArrayList<>();
        cursosProfessor.add(curso);
        professor.setCursos(cursosProfessor);

        professor.imprimir();
    }
}
