package easy;

public class Exercicio05 {

    public int soma(int numero1, int numero2, int numero3) {
        int soma;

        soma = numero1 + numero2 + numero3;

        return soma;
       
        // subtracao = numero1 - numero2 - numero3;
        // multiplicacao = numero1 * numero2 * numero3;
        // media = (numero1 + numero2 + numero3) / 3;


    }
    
    public int subtracao(int numero1, int numero2, int numero3) {
        int subtracao;

        subtracao = numero1 - numero2 - numero3;

        return subtracao;
        // multiplicacao = numero1 * numero2 * numero3;
        // media = (numero1 + numero2 + numero3) / 3;

    }

    public int multiplicacao(int numero1, int numero2, int numero3) {
        int multiplicacao;

        multiplicacao = numero1 * numero2 * numero3;

        return multiplicacao;
        // media = (numero1 + numero2 + numero3) / 3;
    }

    public int media(int soma) {
        int media;

        media = soma/ 3;

        return media;
    }


}
