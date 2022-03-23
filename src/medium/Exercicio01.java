package medium;

public class Exercicio01 {
    public void verificarParOuImpar() {
        int i = 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("O número: " +i  +" é par");
            } else {
                System.out.println("O número: " +i  +" é impar");
            }
            i++;
        }   
    }   
}
