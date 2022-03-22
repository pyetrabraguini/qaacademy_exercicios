package easy;


public class Exercicio07 {
    public String calcularInss(Double salario) {
        double inss;

        // salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
    

        if (salario <= 1045.00) {
        inss = salario * 0.075;
        return "O valor de inss será: "+inss;
        // System.out.println("O Valor de inss será: " +inss);
        }

        if (salario >= 1045.01 && salario <= 2089.60){
        inss = salario * 0.09;
        return "O valor de inss será: "+inss;
        // System.out.println("O Valor de inss será: " +inss);
        }

        if (salario >= 2089.61 && salario <=3134.40) {
            inss = salario * 0.12;  
            return "O valor de inss será: "+inss;
            // System.out.println("O Valor de inss será: " +inss); 
        }

        if (salario >= 3134.41 && salario <= 6101.06){
            inss = salario * 0.14;
            return "O valor de inss será: "+inss;
            // System.out.println("O Valor de inss será: " +inss); 
        }

        if (salario >= 6101.07){
            inss = 854.15;
            return "O valor de inss será: "+inss;
            // System.out.println("O Valor de inss será: " +inss);
        }
        return "Não foi possível calcular o valor do inss";

    }
    
}