package exemploExercicios;

public class ExemploComRetorno {
    public static void main(String[] args) {
        String status1 = verificarImposto1();
        System.out.println(status1);
        String status2 = verificarImposto2();
        System.out.println(status2);
        String status3 = verificarImposto3();
        System.out.println(status3);
        String status4 = verificarImposto4();
        System.out.println(status4);       
        String status5 = verificarImposto5();
        System.out.println(status5);
    }

    public static String verificarImposto1() {
        double salario = 1000.00;
        if (salario <= 1045.00) {
            return "Insento";
        } else {
            return "Pagador";
        }  
    }

    public static String verificarImposto2() {
        double salario = 2000.00;
        if (salario <= 1045.00) {
            return "Insento";
        } else {
            return "Pagador";
        }        
    }

    public static String verificarImposto3() {
        double salario = 3000.00;
        if (salario <= 1045.00) {
            return "Insento";
        } else {
            return "Pagador";
        }
     }
        
        public static String verificarImposto4() {
            double salario = 4000.00;
            if (salario <= 1045.00) {
                return "Insento";
            } else{
                return "Pagador";
            }            
        }

        public static String verificarImposto5() {
            double salario = 5000.00;
            if (salario <= 1045.00) {
                return "Insento";
            } else {
                return "Pagador";
            }           
        }

    }
