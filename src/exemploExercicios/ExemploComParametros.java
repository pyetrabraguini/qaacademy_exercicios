package exemploExercicios;

public class ExemploComParametros {
    public static void main(String[] args) {

        exemploSemRetorno1("Segunda", "Terça");
        exemploSemRetorno2 ("Azul", "Vermelho");
        exemploSemRetorno3("Fone de Ouvido", "Carregador");
        exemploSemRetorno4("Itália", "França");
        exemploSemRetorno5("Sol", "Lua");

        System.out.println(exemploComRetorno1("João ", " Maria "));
        System.out.println(exemploComRetorno2("Francisco", " Antonio"));  
        System.out.println(exemploComRetorno3("Português", " Matemática")); 
        System.out.println(exemploComRetorno4("Jeep", " Audi"));
        System.out.println(exemploComRetorno5("Bahia", " Maranhão"));

    }

    public static void exemploSemRetorno1(String diaUm, String diaDois) {
    System.out.println(diaUm);  
    System.out.println(diaDois);
    }

    public static void exemploSemRetorno2(String corUm, String corDois) {
        System.out.println(corUm);
        System.out.println(corDois);    
    }

    public static void exemploSemRetorno3(String objetoUm, String objetoDois) {
        System.out.println(objetoUm);
        System.out.println(objetoDois);       
    }

    public static void exemploSemRetorno4(String paisUm, String paisDois) {
        System.out.println(paisUm);
        System.out.println(paisDois);  
    }

    public static void exemploSemRetorno5(String palavraUm, String palavraDois) {
        System.out.println(palavraUm);
        System.out.println(palavraDois);  
    }

    public static String exemploComRetorno1(String pessoaUm, String pessoaDois) {
        String pessoas = pessoaUm + pessoaDois;
        return pessoas;       
    }

    public static String exemploComRetorno2(String nomeUm, String nomeDois) {
        String nomes = nomeUm + nomeDois;
        return nomes;   
    }
   
    public static String exemploComRetorno3(String materiaUm, String materiaDois) {
        String materias = materiaUm + materiaDois;
        return materias;   
    }

    public static String exemploComRetorno4(String carroUm, String carroDois) {
        String carros = carroUm + carroDois;
        return carros;       
    }

    public static String exemploComRetorno5(String lugarUm, String lugarDois) {
        String lugares = lugarUm + lugarDois;
        return lugares;        
    }

}
