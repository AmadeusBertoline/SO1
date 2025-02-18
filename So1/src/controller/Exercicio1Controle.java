package controller;
public class Exercicio1Controle {
    
    // Método para preencher e percorrer o vetor
    public void percorrerVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        
        // Preencher o vetor com 0
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = 0;
        }
        
        // Medir o tempo gasto para percorrer o vetor
        long startTime = System.nanoTime();
        for (int i = 0; i < tamanho; i++) {
            int valor = vetor[i];  // A operação é apenas acessar o valor
        }
        long endTime = System.nanoTime();
        
        // Calcular e exibir o tempo em segundos
        double tempoSegundos = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Tempo para percorrer vetor de " + tamanho + " posições: " + tempoSegundos + " segundos");
    }
}
