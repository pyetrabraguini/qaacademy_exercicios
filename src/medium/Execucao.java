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
        // Exercicio04 exercicio04 = new Exercicio04();
        // exibirVetor(exercicio04.multiplicaAteMil());

        // int[] vetorNumeros = { 5, 4, 8, 1, 2 }; // Cria o vetorEpreenche os valores
        // Exercicio05 exercicio05 = new Exercicio05();
        // System.out.println(exercicio05.verificaMenorValor(vetorNumeros));

        // Exercicio06 exercicio06 = new Exercicio06();
        // System.out.println(exercicio06.calculaFatorial(5));

        // Exercicio07 exercicio07 = new Exercicio07();
        // exibirVetor(exercicio07.preencheVetorMeses());

        // String [] vetorAlunos = {"Flavio", "Reinaldo", "Samuel", "Edmond", "Pedro"}; 
        // int [] vetorNumeroAlunos = {1,2,3,4,5}; 

        // Exercicio09 exercicio09 = new Exercicio09(); 
        // exercicio09.exibeAlunosENumeros(vetorAlunos,vetorNumeroAlunos);

        Exercicio10 exercicio10 = new Exercicio10();
        System.out.println("Exibe o valor do termo: " + exercicio10.calcularFibonacci(10));
        exibirVetor(exercicio10.calcularFibonacciVetor(10));

    }

    public static void exibirVetor(int[] vetorParaImprimir) {
        int i = 0;
        while (i < vetorParaImprimir.length) {
            System.out.println(vetorParaImprimir[i]);
            i++;
        }
    }

    public static void exibirVetor(String[] vetorParaImprimir) {
        int i = 0;
        while (i < vetorParaImprimir.length) {
            System.out.println(vetorParaImprimir[i]);
            i++;
        }
    }

    
}
