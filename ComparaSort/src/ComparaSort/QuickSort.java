package ComparaSort;

public class QuickSort {
    
    static int trocas = 0;
    
    public static Resultado sort(double[] vetor, int esquerda, int direita){
        if (esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            sort(vetor, esquerda, p);
            sort(vetor, p + 1, direita);
        }
        return new Resultado(vetor, trocas);
    }    
    
    private static int particao(double[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        double pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita;
        while(true){
            do{
                i++;
            }while(vetor[i] < pivot);
            do{
                j--;
            }while(vetor[j] > pivot);
            if (i >= j){
                return j;
            }
            double aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            trocas++;
        }
    }
}
