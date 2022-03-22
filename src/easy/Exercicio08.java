package easy;

public class Exercicio08 {
    public String calcularImposto(double salario) {

        double imposto=0;

        // String salarioStg = JOptionPane.showInputDialog("Digite o seu salário: ");
        // salario = Double.parseDouble(salarioStg);


        if (salario > 0 && salario <= 1903.98 ) {
            return "Insento de imposto de renda" + "\n" +
            "O salario bruto é: "+salario + "\n" +
            "O salario liquido é: "+(salario-imposto);
            // System.out.println("Isento de imposto de renda");
        }

        if (salario >= 1903.99 && salario <= 2826.65) {
            imposto = (salario * 0.075) - 142.80;
            return "O imposto será: "+imposto + "\n" +
            "O salario bruto é: "+salario + "\n" +
            "O salario liquido é: "+(salario-imposto);
        }

        if (salario >= 2826.66 && salario <= 3751.05) {
            imposto = (salario * 0.15) - 354.80;
            return "O imposto será: "+imposto + "\n" +
            "O salario bruto é: "+salario + "\n" +
            "O salario liquido é: "+(salario-imposto);
        }

        if (salario >= 3751.06 && salario <= 4664.68) {
            imposto = (salario * 0.225) - 636.13;
            return "O imposto será: "+imposto + "\n" +
            "O salario bruto é: "+salario + "\n" +
            "O salario liquido é: "+(salario-imposto);
        }

        if (salario >= 4664.68) {
            imposto = (salario * 0.275) - 869.36;
            return "O imposto será: "+imposto + "\n" +
            "O salario bruto é: "+salario + "\n" +
            "O salario liquido é: "+(salario-imposto);
        }
        return "Não foi possível calcular o imposto de renda";

    }
    
}