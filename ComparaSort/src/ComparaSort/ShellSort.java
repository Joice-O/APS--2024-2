
package ComparaSort;

public class ShellSort {
    public static Resultado sort(double[] vetor){
        int trocas = 0;
        int h = 1;
        int n = vetor.length;
        while(h < n){
            h = h * 3 + 1;
        }
        h = (h - 1) / 3;
        
        double elemento; int j;
        while(h > 0){
            for(int i = h; i < n; i++){
                elemento = vetor[i];
                j = i;
                while(j >= h && vetor[j - h] > elemento){
                    vetor[j] = vetor[j - h];
                    j = j - h;
                    trocas++;
                }
                vetor[j] = elemento;
                trocas++;
            }
            h = (h -1) / 3;
        }
        return new Resultado(vetor, trocas);
    }
}
