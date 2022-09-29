package entidades;

public class Funcionario extends PessoaFisica {
    // Construtor
    public Funcionario(String cpf){
        super(cpf);
    }

    // Atributos especificos da classe funcionario
    private double salario;
    private String matricula;

    // Getters e setters
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return super.toString() + "MATRICULA: " + getMatricula() +
        "\nSALARIO: " + getSalario();
    }

    // Gerando um JSON
    public String toJson() {
        return super.toJson() + "\t\"MATRICULA\": \"" + getMatricula() + "\",\n" +
                "  \t\"SALARIO\": \"" + getSalario() + "\"\n" +
                "}";
    }
}