package view;
import java.util.Scanner;

import controller.Exercicio1Controle;

public class Exercicio1Visao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercicio1Controle controle = new Exercicio1Controle();
        
        // Testar com 1000, 10000 e 100000 posições
        controle.percorrerVetor(1000);
        controle.percorrerVetor(10000);
        controle.percorrerVetor(100000);
        
        scanner.close();
    }
}
