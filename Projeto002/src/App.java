import entidades.Cliente;
import entidades.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente obj1 = new Cliente("481.960.578.06");
        obj1.setNome("GUI");
        obj1.setScoreCredito(1000);
        
        Funcionario obj2 = new Funcionario("481.960.578.06");
        obj2.setNome("FERNANDA");
        obj2.setSalario(1000);        

        Util.info(obj1);
        Util.info(obj2);
    }

    

    // public static void info(Cliente cliente){
    //     System.out.println("JSON do " + cliente.toJson());
    // }
    
}
