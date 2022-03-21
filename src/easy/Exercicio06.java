package easy;


public class Exercicio06 {
    public String verificarAprovacao(double nota1, double nota2) {
        double media;

        // String nota1String, nota2String;
        // nota1String = JOptionPane.showInputDialog("Digite a primeira nota");
        // nota2String = JOptionPane.showInputDialog("Digite a segunda nota");
        // nota1 = Double.parseDouble(nota1String);
        // nota2 = Double.parseDouble(nota2String);

        media = (nota1 + nota2) / 2;

        if (media > 5) {
            return "Aprovado";
            // System.out.println("Aprovado");
        }

        if (media < 5) {
            return "Reprovado";
            // System.out.println("Reprovado");
        }

        if (media == 5) {
            return "Exame";
            // System.out.println("Exame");
        }
        return "Não foi possível calcular sua nota";

    }

}
