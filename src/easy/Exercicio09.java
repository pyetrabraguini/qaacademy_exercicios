package easy;

public class Exercicio09 {
    public void calcularTabuada(Integer numeroDigitado) {
        int i = 1, tabuada;

        while (i <= 10) {
            tabuada = numeroDigitado * i;
           System.out.println(numeroDigitado + " X " + i + " = " + tabuada);
            i++;       
        }    
        
    }
}