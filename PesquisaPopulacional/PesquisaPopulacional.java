package PesquisaPopulacional;

import java.util.Scanner;

public class PesquisaPopulacional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 0;
        int totalMulheresComOlhosECabelosCastanhos = 0;
        
        while (true) {
            // Solicita os dados do habitante
            System.out.print("Sexo (m ou f): ");
            String sexo = scanner.nextLine().toLowerCase();
            if (!sexo.equals("m") && !sexo.equals("f")) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }
            
            System.out.print("Cor dos olhos (a, v, c ou p): ");
            String corOlhos = scanner.nextLine().toLowerCase();
            if (!corOlhos.equals("a") && !corOlhos.equals("v") && !corOlhos.equals("c") && !corOlhos.equals("p")) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }
            
            System.out.print("Cor dos cabelos (l, c, p ou r): ");
            String corCabelos = scanner.nextLine().toLowerCase();
            if (!corCabelos.equals("l") && !corCabelos.equals("c") && !corCabelos.equals("p") && !corCabelos.equals("r")) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }
            
            System.out.print("Idade (entre 10 e 100): ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir o \n deixado pelo nextInt()
            if (idade < 10 || idade > 100) {
                System.out.println("Idade inválida. Tente novamente.");
                continue;
            }
            
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir o \n deixado pelo nextDouble()
            if (salario < 0) {
                System.out.println("Salário inválido. Tente novamente.");
                continue;
            }
            
            // Se a idade for -1, interrompe o laço de repetição
            if (idade == -1) {
                break;
            }
            
            // Verifica se o habitante é do sexo feminino, tem olhos e cabelos castanhos e idade entre 18 e 35 anos
            if (sexo.equals("f") && corOlhos.equals("c") && corCabelos.equals("c") && idade >= 18 && idade <= 35) {
                totalMulheresComOlhosECabelosCastanhos++;
            }
            
            totalPessoas++;
        }
        
        // Calcula a porcentagem de mulheres com olhos e cabelos castanhos
        double porcentagemMulheresComOlhosECabelosCastanhos = (double) totalMulheresComOlhosECabelosCastanhos / totalPessoas * 100;
        
        // Exibe o resultado
        System.out.println("Porcentagem de mulheres com olhos e cabelos castanhos entre 18 e 35 anos: " + porcentagemMulheresComOlhosECabelosCastanhos + "%");
    }

}
