package easy;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public double calcularValorJuros(Double valorInvestimento) {
        double taxaJuros = 0.05, valorJuros = 0.0, ano = 1;
        valorInvestimento = 1000.00;

        // String valorinvestimentoStg = JOptionPane.showInputDialog("Digite o valor investido");
        // valorInvestimento = Double.parseDouble(valorinvestimentoStg);


        while (ano <= 10) {
            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano++;
        }

        // valorTotal = valorJuros + valorInvestimento;

        // System.out.println("Você investiu: " +valorInvestimento);
        // System.out.println("Você rendeu: " +valorJuros  + "de Juros");
        // System.out.println("O valor total são: " +valorTotal);
        return valorJuros;

    }
    

}

