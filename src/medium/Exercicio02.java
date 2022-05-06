package medium;

public class Exercicio02 {
    public double calcularInvestimentoJurosCompostos(double valorInvestimento) {

        double taxaJuros = 0.05, totalAtualizadoComJuros;
        int ano = 1, tempoInvestido = 10;
        totalAtualizadoComJuros = valorInvestimento;

        while (ano <= tempoInvestido) {
            totalAtualizadoComJuros = 
            (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros;
            ano++;
        }
        return totalAtualizadoComJuros - valorInvestimento;

    }
    
}