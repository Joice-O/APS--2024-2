package ComparaSort;

public class Resultado {
    private double[] vetor;// Array que contém os elementos ordenados
    private int trocas;// Contador de trocas realizadas
    
    //Construtor que inicializa o vetos e o n° de trocas
    public Resultado(double[] vetor, int trocas){
        this.vetor = vetor;
        this.trocas = trocas;
    }
    // Método para obter o vetor ordenado
    public double[] getVetor() {
        return vetor;
    }
    //Método para obter as trocas realizadas
    public int getTrocas() {
        return trocas;
    }
    
    
}
