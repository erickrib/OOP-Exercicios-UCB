package CadastroPessoa;
import java.util.Scanner;

import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String pessoa = sc.nextLine();

        System.out.println("Digite a idade do pessoa: ");
        int idade = sc.nextInt();

        System.out.println("Digite o salário do pessoa: ");
        double salario = sc.nextDouble();

        System.out.println("Digite o peso do pessoa: ");
        
        System.out.println("Nome: " + pessoa + "\nIdade: " + idade + "\nSalário: " + salario);
        
        sc.close();

        String nome;
        nome = JOptionPane.showInputDialog("Digite o nome do pessoa: ");

        String idadeInt;
        idadeInt = JOptionPane.showInputDialog("Digite a idade do pessoa: ");

        double salarioFloat;
        salarioFloat = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do pessoa: "));
        
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idadeInt + "\nSalário: " + salarioFloat);
        
    }
}
