public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, double salario, String matricula, double ajudaDeCusto) {
        super(nome, endereco, telefone, salario, matricula);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.ajudaDeCusto;
    }
}