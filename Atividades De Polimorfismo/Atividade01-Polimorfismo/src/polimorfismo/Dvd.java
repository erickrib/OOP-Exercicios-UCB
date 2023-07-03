package polimorfismo;

import java.util.Scanner;

public class Dvd extends Midia{
    private int nFaixas;

    public Dvd() {
    }

    public Dvd(int f, int c, double p, String s) {
        super(c, p, s);
        this.nFaixas = f;
    }
    
    @Override
    public String getTipo(){
        return "DVD ";
    }

    public int getFaixas() {
        return nFaixas;
    }

    public void setFaixas(int f) {
        this.nFaixas = f;
    }
    
    @Override
    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        super.inserirDados();
        System.out.println("Digite o numero de faixas: ");
        setFaixas(sc.nextInt());
    }
    
    
    @Override
    public String getDetalhes(){
        return super.getDetalhes() + ", Faixas = " + getFaixas() + '}';
    }
    
    
}
