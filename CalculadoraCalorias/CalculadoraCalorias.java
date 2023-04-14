package CalculadoraCalorias;

import java.util.Scanner;

public class CalculadoraCalorias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o prato:");
        System.out.println("1 - Vegetariano (180 cal)");
        System.out.println("2 - Peixe (230 cal)");
        System.out.println("3 - Frango (250 cal)");
        System.out.println("4 - Carne (350 cal)");
        int prato = sc.nextInt();

        System.out.println("Escolha a sobremesa:");
        System.out.println("1 - Abacaxi (75 cal)");
        System.out.println("2 - Sorvete Diet (110 cal)");
        System.out.println("3 - Mouse Diet (170 cal)");
        System.out.println("4 - Mouse Chocolate (200 cal)");
        int sobremesa = sc.nextInt();

        System.out.println("Escolha a bebida:");
        System.out.println("1 - Chá (20 cal)");
        System.out.println("2 - Suco de laranja (70 cal)");
        System.out.println("3 - Suco de melão (100 cal)");
        System.out.println("4 - Refrigerante Diet (65 cal)");
        int bebida = sc.nextInt();

        int totalCalorias = 0;
        switch (prato) {
            case 1:
                totalCalorias += 180;
                break;
            case 2:
                totalCalorias += 230;
                break;
            case 3:
                totalCalorias += 250;
                break;
            case 4:
                totalCalorias += 350;
                break;
            default:
                System.out.println("Opção inválida para o prato.");
        }

        switch (sobremesa) {
            case 1:
                totalCalorias += 75;
                break;
            case 2:
                totalCalorias += 110;
                break;
            case 3:
                totalCalorias += 170;
                break;
            case 4:
                totalCalorias += 200;
                break;
            default:
                System.out.println("Opção inválida para a sobremesa.");
        }

        switch (bebida) {
            case 1:
                totalCalorias += 20;
                break;
            case 2:
                totalCalorias += 70;
                break;
            case 3:
                totalCalorias += 100;
                break;
            case 4:
                totalCalorias += 65;
                break;
            default:
                System.out.println("Opção inválida para a bebida.");
        }

        System.out.printf("A refeição escolhida tem um total de %d calorias.%n", totalCalorias);

        sc.close();
    }
}
