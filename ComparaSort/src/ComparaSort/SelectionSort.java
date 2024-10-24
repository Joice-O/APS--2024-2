package ComparaSort;

public class SelectionSort {
    public static Resultado sort(double[] vetor){
        //Contador de trocas
        int trocas = 0;
        //Selection sort O(N^2)
        int posicao_menor; //Posição do menor elemento 
        double aux;//Auxiliar para troca de valores
        
        //Loop que percorre todo o vetor
        for(int i=0; i < vetor.length; i++){ //O(N)
            posicao_menor = i;// Assume que o 1° elemento da sub-lista é o menor
            //Loop que busca o menor elemento na sub-lista
            for(int j = i+1; j < vetor.length; j++){ //O(N)
                //Se o elemento atual for menor que o encontrado atualiza a poseção do menor
                if (vetor[j] < vetor[posicao_menor]){
                    posicao_menor = j;
                }
            }
            //Troca o menor com o elemento na posição atual
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
            trocas++;
        }
        // Retorna o resultado com o vetor ordenado e a quatidade de trocas
        return new Resultado(vetor, trocas);
}
}