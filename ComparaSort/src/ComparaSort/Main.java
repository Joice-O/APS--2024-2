package ComparaSort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double[] vetor = null;//Icializa o vetor como null
        //Tenta ler o arquivo e carregar os dados 
        try (BufferedReader br = new BufferedReader(new FileReader("M01_2024 - 129615.txt"))) {
            // Lê a primeira linha para definir o tamanho do array
            String firstLine = br.readLine();
            if (firstLine != null) {
                int size = Integer.parseInt(firstLine.trim());
                vetor = new double[size]; // Cria o array com o tamanho especificado

                // Loop que lê os números subsequentes
                for (int i = 0; i < size; i++) {
                    String line = br.readLine();
                    if (line != null) {
                        vetor[i] = Double.parseDouble(line.trim()); // Converte para double
                    } else {
                        // Exibe uma mensagem se houver menos números no arquivo do que o esperado
                        JOptionPane.showMessageDialog(null,"Menos de " + size + " números no arquivo.");
                        break;
                    }
                }
            } else {
                // Exibe uma mensagem se o arquivo estiver vazio
                JOptionPane.showMessageDialog(null,"Arquivo vazio.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
             // Exibe uma mensagem se houver erro ao converter o tamanho do array ou um número
            JOptionPane.showMessageDialog(null,"Erro ao converter o tamanho do array ou um número.");
        }
        // Se o vetor foi carregado corretamente, prossegue com a ordenação
        if (vetor != null) {
            StringBuilder resultados = new StringBuilder();//Armazena os resultados
            long inicio, fim;// Variáveis para medir o tempo de execução
            Resultado resultado;
             // Adiciona informações iniciais sobre o tamanho do vetor
             resultados.append("Resultados de Ordenação do vetor de tamanho: ").append(vetor.length).append("\n");

        
        resultados.append("\n\nBubble Sort\n");
        inicio = System.currentTimeMillis(); //Captura o tempo de inicio
        resultado = BubbleSort.sort(vetor.clone()); //Ordena uma cópia do vetor
        fim = System.currentTimeMillis(); //Captura o tempo de fim
        resultados.append("Tempo: ").append(fim - inicio).append(" ms\n"); //Adiciona o tempo de execução
        resultados.append("Trocas: ").append(resultado.getTrocas()).append("\n"); //Adiociona o n° de trocas
        
        
        resultados.append("\n\nSelection Sort\n");
        inicio = System.currentTimeMillis();
        resultado = SelectionSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        resultados.append("Tempo: ").append(fim - inicio).append(" ms\n");
        resultados.append("Trocas: ").append(resultado.getTrocas()).append("\n");
   
        
        resultados.append("\n\nQuick Sort\n");
        inicio = System.currentTimeMillis();
        resultado = QuickSort.sort(vetor.clone(), 0, vetor.length);
        fim = System.currentTimeMillis();
        resultados.append("Tempo: ").append(fim - inicio).append(" ms\n");
        resultados.append("Trocas: ").append(resultado.getTrocas()).append("\n");
        
        
       resultados.append("\n\nShell Sort\n");
        inicio = System.currentTimeMillis();
        resultado = ShellSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        resultados.append("Tempo: ").append(fim - inicio).append(" ms\n");
        resultados.append("Trocas: ").append(resultado.getTrocas()).append("\n");
        
        // Exibe uma janela de diálogo com os resultados da ordenação
        JOptionPane.showMessageDialog(null, resultados.toString());
        } else {
            // Se o vetor não foi carregado corretamente, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Não foi possível ler os dados do arquivo.");
        }
        
    }
}
