import entidades.PessoaFisica;

public class Util {
    public static void info(PessoaFisica pf){ 
        // System.out.println(pf.toString());             
        System.out.println(pf.toJson()+ "\n");
    }
}