package easy;

public class Exercicio11 {
    public void calcularSoma(int digitadoNumero) {
        int i = 1, soma;

        // String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número");
        // numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        soma = digitadoNumero;
        while (i <= 100) {
            soma = soma + 2;
            System.out.println("A soma é: " +soma);
            i++;
        }
        
    }
    
}