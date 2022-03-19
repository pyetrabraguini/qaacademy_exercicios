package medium;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {

        double valorInvestimento, taxaJuros = 0.05, valorJuros, valorTotal;
        int i = 1;

        String valorInvestimentoStg = JOptionPane.showInputDialog("Digite o valor investido");
        valorInvestimento = Double.parseDouble(valorInvestimentoStg);
        valorTotal = valorInvestimento;


        while (i <= 10) {
            valorTotal = (valorTotal*taxaJuros) +valorTotal;
            i++;
        }

        valorJuros = valorTotal - valorInvestimento;

        System.out.println("Você investiu : " +valorInvestimento);
        System.out.print("Rendeu: " +valorJuros +" de juros");
        System.out.println("O valor total são: " +valorTotal);
    }
    
}