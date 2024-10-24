package ComparaSort;

public class QuickSort {
    //Contador de trocas
    static int trocas = 0;
    
    //Método quye ordena o vetor
    public static Resultado sort(double[] vetor, int esquerda, int direita){
        if (esquerda < direita){
            //Chama o método de partição para encontrar o pivô
            int p = particao(vetor, esquerda, direita);
            // Ordena sub-list à esquerda
            sort(vetor, esquerda, p);
            //Ordena sub-list à direita
            sort(vetor, p + 1, direita);
        }
        //Retorna o resultado com o vetor ordenado e a quatidade de trocas
        return new Resultado(vetor, trocas);
    }    
    
    //Método auxiliar que realiza a partição do vetor
    private static int particao(double[] vetor, int esquerda, int direita){
        //Calcula o índice do meio do vetor para usar como pivô
        int meio = (int) (esquerda + direita) / 2;
        double pivot = vetor[meio];//pivô
        int i = esquerda - 1;//índice inicial para esquerda
        int j = direita;//índice inicial para direita 
        //Loop que se repete até fazer a partição
        while(true){
            //Move i para a direita até encontrar  um elemento > ou = ao pivô
            do{
                i++;
            }while(vetor[i] < pivot);
            //Move i para a direita até encontrar  um elemento < ou = ao pivô
            do{
                j--;
            }while(vetor[j] > pivot);
            //Quando se cruzarem retorna o indice de partição
            if (i >= j){
                return j;
            }
            //Troca os elementos nos índices i e j
            double aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            trocas++; //Incrementa o contador
        }
    }
}
