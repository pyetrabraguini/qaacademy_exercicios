package medium;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {

        int i = 1, menor = 0, numeroDigitado;

        while (i <= 5) {
             numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("digite um número"));
            if (numeroDigitado < menor || i == 1) {
                menor = numeroDigitado;
            }
            i++;
        }

        System.out.println("O menor número digitado é: " +menor);
        
    }
    
}
