package easy;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {

        String numero1DigitadoString = JOptionPane.showInputDialog("Digite o primeiro numero");
        String numero2DigitadoString = JOptionPane.showInputDialog("Digite o segundo numero");
        String numero3DigitadoString = JOptionPane.showInputDialog("Digite o terceiro numero");
       
        int numero1 = Integer.parseInt(numero1DigitadoString);
        int numero2 = Integer.parseInt(numero2DigitadoString);
        int numero3 = Integer.parseInt(numero3DigitadoString);

        int soma = numero1 + numero2 + numero3;
        int subtracao = numero1 - numero2 - numero3;
        int multiplicacao = numero1 * numero2 * numero3;
        int media = soma/3;

        System.out.println("A soma é: " + soma);
        System.out.println("A subtracao é: " + subtracao);
        System.out.println("A multiplicacao é: " + multiplicacao);
        System.out.println("A media é: " + media);
        


    }
    
}
