package ComparaSort;

public class BubbleSort {
    public static Resultado sort(double[] vetor){
        int trocas = 0;
    
        double aux;
        for(int i = 0; i < vetor.length; i++){ 
            for(int j = i + 1; j < vetor.length; j++){ 
                if (vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                    trocas++;
                }
            }
        }
        return new Resultado(vetor, trocas);
    }
}
