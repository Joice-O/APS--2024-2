package ComparaSort;

public class Resultado {
    private double[] vetor;
    private int trocas;
    
    public Resultado(double[] vetor, int trocas){
        this.vetor = vetor;
        this.trocas = trocas;
    }

    public double[] getVetor() {
        return vetor;
    }

    public int getTrocas() {
        return trocas;
    }
    
    
}
