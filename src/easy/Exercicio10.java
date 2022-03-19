package easy;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {

        double valorInvestimento, taxaJuros = 0.05, valorJuros = 0, valorTotal;
        int i = 1;

        String valorinvestimentoStg = JOptionPane.showInputDialog("Digite o valor investido");
        valorInvestimento = Double.parseDouble(valorinvestimentoStg);


        while (i <= 10) {
            valorJuros = (valorJuros+valorInvestimento) * taxaJuros;
            i++;
        }

        valorTotal = valorJuros + valorInvestimento;

        System.out.println("Você investiu: " +valorInvestimento);
        System.out.println("Você rendeu: " +valorJuros  + "de Juros");
        System.out.println("O valor total são: " +valorTotal);

    }
    

}

