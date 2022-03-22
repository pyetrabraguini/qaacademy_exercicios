package easy;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {
        // Exercicio02 exercicio02 = new Exercicio02();
        // String palavraDigitada = exercicio02.retornaPalavraDigitada("Pyetra Braguini");
        // System.out.println(palavraDigitada);

        // String valorUm = JOptionPane.showInputDialog("Digite o primeiro valor");
        // String valorDois = JOptionPane.showInputDialog("Digite o segundo valor");
        //  Exercicio03 exercicio03 = new Exercicio03(); //instanciando a classe do exercicio
        // System.out.println(exercicio03.retornaTrocado(valorUm, valorDois));

        
        // String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um número");
        // int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
        // Exercicio04 exercicio04 = new Exercicio04();
        // System.out.println("O dobro de " +numeroDigitado +" = " +exercicio04.calcularDobro(numeroDigitado));

    //     String numero1String = JOptionPane.showInputDialog("Digite o primeiro número");
    //     String numero2String = JOptionPane.showInputDialog("Digite o segundo número");
    //     String numero3String = JOptionPane.showInputDialog("Digite o terceiro número");

    //     int numero1 = Integer.parseInt(numero1String);
    //     int numero2 = Integer.parseInt(numero2String);
    //     int numero3 = Integer.parseInt(numero3String);

    //     Exercicio05 exercicio05 = new Exercicio05();
    //    System.out.println("A soma dos números é: " +exercicio05.soma(numero1, numero2, numero3));
    //    System.out.println("A subtração é: " +exercicio05.subtracao(numero1, numero2, numero3));
    //    System.out.println("A multiplicação é: " +exercicio05.multiplicacao(numero1, numero2, numero3));
    //    int soma = exercicio05.soma(numero1, numero2, numero3);
    //    System.out.println("A média é: " +exercicio05.media(soma));


        // String nota1String, nota2String;
        // nota1String = JOptionPane.showInputDialog("Digite a primeira nota");
        // nota2String = JOptionPane.showInputDialog("Digite a segunda nota");

        // double nota1 = Double.parseDouble(nota1String);
        // double nota2 = Double.parseDouble(nota2String);

        // Exercicio06 exercicio06 = new Exercicio06();
        // System.out.println(exercicio06.verificarAprovacao(nota1, nota2));

        String salarioString;
        salarioString = JOptionPane.showInputDialog("Digite o salário");
        double salario = Double.parseDouble(salarioString);
        Exercicio07 exercicio07 = new Exercicio07();
        System.out.println(exercicio07.calcularInss(salario));
        
    }
    
}
