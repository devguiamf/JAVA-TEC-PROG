package entidades;

public class Contato {
    private String email;
    private String telefone;
    private String celular;
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void settelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    @Override
    public String toString() {
        return "Contato [E-MAIL=" + email + ", CELULAR=" + celular + ", TELEFONE=" + telefone + "]";
    }

    public String toJson(){
        return "{ \"E-MAIL\": \"" + getEmail() + "\"," +
                "  \"CELULAR\": \"" + getCelular() + "\"," +
                "  \"TELEFONE\": \"" + getTelefone() + "\"},";
    }  
    

    
}
