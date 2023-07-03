package polimorfismo;

import java.util.Scanner;

public class Midia {
    
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {
    }

    public Midia(int c, double p, String s) {
        this.codigo = c;
        this.preco = p;
        this.nome = s;
    }
    
    public String getTipo(){
        return "Mídia";
    }
    
    public String getDetalhes(){
        return "Codigo = " + codigo + ", preco = " + preco + ", nome = " + 
                nome;
    }

    public void printDados(){
        System.out.println(getTipo() + getDetalhes());
    }
    
    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.nome = sc.nextLine();
        System.out.println("Digite o preco: ");
        this.preco = sc.nextDouble();
        System.out.println("Digite o codigo: ");
        this.codigo = sc.nextInt();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
