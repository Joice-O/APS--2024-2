
package ComparaSort;

public class ShellSort {
    public static Resultado sort(double[] vetor){
        //Contador de trocas
        int trocas = 0;
        //h determina a distância entre os elementos a serem comparados
        int h = 1;
        int n = vetor.length;
        //Calcula o valor inicial de h
        while(h < n){
            h = h * 3 + 1;
        }
        //Ajusta o valor de h para o últmo válido sem ultrapassar n
        h = (h - 1) / 3;
        
        double elemento;
        int j;
        //Loop que continua enquanto h > 0
        while(h > 0){
            //Percorre o vetor a partir do índice h
            for(int i = h; i < n; i++){
                elemento = vetor[i];
                j = i;
                //Realiza a inserção do elemento na posição correta
                while(j >= h && vetor[j - h] > elemento){
                    vetor[j] = vetor[j - h];//Move o elemento pra frente
                    j = j - h;//Decrementa j para continuar a comparação
                    trocas++;//Incrementa o contator de trocas
                }
                vetor[j] = elemento;//Insere o elemento na posição correta
                trocas++;//Incrementa o contator de trocas
            }
            //Reduz h para o próximo valor da sequência de Shell
            h = (h -1) / 3;
        }
        // Retorna o resultado com o vetor ordenado e a quatidade de trocas
        return new Resultado(vetor, trocas);
    }
}
