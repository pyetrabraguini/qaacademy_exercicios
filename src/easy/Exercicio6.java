package easy;

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {

        double nota1, nota2;
        double media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));

        media = (nota1 + nota2) / 2;

        if (media > 5) {
            System.out.println("Aprovado");
        }

        if (media < 5) {
            System.out.println("Reprovado");
        }

        if (media == 5) {
            System.out.println("Exame");
        }

    }

}
