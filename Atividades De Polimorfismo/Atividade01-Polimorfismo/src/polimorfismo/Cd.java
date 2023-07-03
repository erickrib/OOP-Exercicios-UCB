/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

import java.util.Scanner;

public class Cd extends Midia{
    private int nMusicas;

    public Cd() {
    }

    public Cd(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    public Cd(int m, int c, double p, String s) {
        super(c, p, s);
        this.nMusicas = m;
    }

    public int getMusica() {
        return nMusicas;
    }

    public void setMusica(int m) {
        this.nMusicas = m;
    }
    
    @Override
    public String getTipo(){
        return "CD ";
    }
    
    @Override
    public String getDetalhes(){
        return super.getDetalhes() + ", numeros de música = " + getMusica() + '}';
    }
    
    @Override
    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        super.inserirDados();
        System.out.println("Digite o número de músicas: ");
        setMusica(sc.nextInt());
    }
}
