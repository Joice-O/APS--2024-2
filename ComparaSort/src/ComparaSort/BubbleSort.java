package ComparaSort;

public class BubbleSort {
    public static Resultado sort(double[] vetor){
        //contador de trocas
        int trocas = 0;
       // variaval auxiliar
        double aux;
        //Loop que percorre o vetor
        for(int i = 0; i < vetor.length; i++){ 
            //Loop que realiza as comparações
            for(int j = i + 1; j < vetor.length; j++){ 
                //Condicão que realiza as trocas caso o elemento atual seja maior que o próximo
                
                if (vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                    trocas++;
                }
            }
        }
        // Retorna o resultado com o vetor ordenado e a quatidade de trocas
        return new Resultado(vetor, trocas);
    }
}
