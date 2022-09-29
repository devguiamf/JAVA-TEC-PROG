package entidades;

public class Cliente extends PessoaFisica {    
    // Construtor
    public Cliente(String cpf){
        super(cpf);
    }    
    
    // Atributos especificos da classe cliente
    private int Credito;
    
    // Getters e setters
    public int getCredito() {
        return Credito;
    }
    public void setScoreCredito(int Credito) {
        this.Credito = Credito;
    }

    public String toString() {
        return super.toString() + "\nCrédito: " + getCredito();
    }

    // Gerando um JSON
    public String toJson() {
        return super.toJson() + "\t\"Credito\": \"" + getCredito() + "\"\n" +
                "}";
    }
}
