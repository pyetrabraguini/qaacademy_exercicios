package medium;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {
        // Exercicio01 exercicio01 = new Exercicio01();
        // exercicio01.verificarParOuImpar();

        // Exercicio 02
        // String valorInvestimentoStg = JOptionPane.showInputDialog("Digite um valor de investimento: ");
        // double valorInvestimento = Double.parseDouble(valorInvestimentoStg);

        // Exercicio02 exercicio02 = new Exercicio02();

        // double valorJuros = exercicio02.calcularInvestimentoJurosCompostos(valorInvestimento);

        // System.out.println("O valor do investimento são: "+valorInvestimento);
        // System.out.println("O valor do juros são: "+valorJuros);
        // System.out.println("O valor total do investimento: "+ (valorJuros + valorInvestimento));

        // Exercicio 03
        // Exercicio03 exercicio03 = new Exercicio03(); 
        // System.out.println(exercicio03.somaAteMil());

        // Exercicio04
        Exercicio04 exercicio04 = new Exercicio04();
        exibirVetor(exercicio04.multiplicaAteMil());


    }

    public static void exibirVetor(int[] vetorParaImprimir) {
        int i = 0;
        while (i < vetorParaImprimir.length){
            System.out.println(vetorParaImprimir[i]);
            i++;
        }
    }
    
}
