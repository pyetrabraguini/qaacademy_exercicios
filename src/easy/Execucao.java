package easy;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {
        // Exercicio02 exercicio02 = new Exercicio02();
        // String palavraDigitada = exercicio02.retornaPalavraDigitada("Pyetra Braguini");
        // System.out.println(palavraDigitada);

        String valorUm = JOptionPane.showInputDialog("Digite o primeiro valor");
        String valorDois = JOptionPane.showInputDialog("Digite o segundo valor");
         Exercicio03 exercicio03 = new Exercicio03(); //instanciando a classe do exercicio
        System.out.println(exercicio03.retornaTrocado(valorUm, valorDois));
    }
    
}
