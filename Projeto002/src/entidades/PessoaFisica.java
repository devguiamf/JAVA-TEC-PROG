package entidades;

import java.time.LocalDate;

public class PessoaFisica {
    private String nome;
    private Endereco endereco;
    private Documento documento;
    private Contato contato;
    private LocalDate dataNascimento;
    
    // Construtor
    public PessoaFisica(String cpf){
        setDocumento(new Documento(cpf));
        setEndereco(new Endereco(null));
        Contato contato = new Contato();
        setContato(contato);
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }
    /**
     * Método que permite alterar o nome
     * @param nome
     */

    public Endereco getEndereco() {
        return endereco;
    }
    /**
     * Método que permite alterar o endereço
     * @param endereco
     */


    public Documento getDocumento() {
        return documento;
    }
    public Contato getContato() {
        return contato;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        return "NOME: " + getNome() + "\nCPF: " + getDocumento().getCpf() + "\nDATA DE NASCIMENTO: " + getDataNascimento() + "\nENDEREÇO: " + getEndereco().toString() + "\nCONTATO: " + getContato().toString();
    }

    public String toJson() {
        return "{\n\t\"NOME\": \"" + getNome() + "\",\n\t\"DOCUMENTO\":" + getDocumento().toJson() + "\n\t\"DATA DE NASCIMENTO\": \"" + getDataNascimento() + "\",\n\t\"ENDEREÇO\": " + getEndereco().toJson() + ",\n\t\"CONTATO\": " + getContato().toJson() + "\n";
    }
    
}
