package exemploInstanciaDeClasse;

public class Execucao {
    public static void main(String[] args) {
        ExemploInstancia obj_exemploInstancia = new ExemploInstancia();
        //variáveis
        System.out.println(obj_exemploInstancia.nome);
        System.out.println(obj_exemploInstancia.idade);
        System.out.println(obj_exemploInstancia.peso); 
        // métodos
        ExemploInstancia.exemploNome("jose");
        ExemploInstancia.exemploIdade(25);
        ExemploInstancia.exemploPeso(80);
    }
    
}
