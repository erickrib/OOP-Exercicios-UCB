public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    public Empregado(String nome, String endereco, String telefone, double salario, String matricula) {
        super(nome, endereco, telefone);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double calcularSalario() {
        return salario;
    }
}
