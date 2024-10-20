package ComparaSort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double[] vetor = null;

        try (BufferedReader br = new BufferedReader(new FileReader("M01_2024 - 129615.txt"))) {
            // Lê a primeira linha para definir o tamanho do array
            String firstLine = br.readLine();
            if (firstLine != null) {
                int size = Integer.parseInt(firstLine.trim());
                vetor = new double[size]; // Cria o array com o tamanho especificado

                // Lê os números subsequentes
                for (int i = 0; i < size; i++) {
                    String line = br.readLine();
                    if (line != null) {
                        vetor[i] = Double.parseDouble(line.trim()); // Converte para double
                    } else {
                        JOptionPane.showMessageDialog(null,"Menos de " + size + " números no arquivo.");
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null,"Arquivo vazio.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Erro ao converter o tamanho do array ou um número.");
        }
        
        if (vetor != null) {
            StringBuilder resultados = new StringBuilder();
            long inicio, fim;
            Resultado resultado;

             resultados.append("Resultados de Ordenação do vetor de tamanho: ").append(vetor.length).append("\n");

        
        resultados.append("\n\nBubble Sort\n");
        inicio = System.currentTimeMillis();
        resultado = BubbleSort.sort(vetor.clone());
        fim = System.currentTimeMillis();
        resultados.append("Tempo: ").append(fim - inicio).append(" ms\n");
        resultados.append("Trocas: ").append(resultado.getTrocas()).append("\n");
        
        
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
        
        JOptionPane.showMessageDialog(null, resultados.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível ler os dados do arquivo.");
        }
        
    }
}
