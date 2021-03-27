package sistemaoficina;

public class Cliente extends Pessoa {
    private String telefone;
    
    public Cliente (String nome, String cpf, String telefone){
        super.setCpf(cpf);
        super.setNome(nome);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "telefone=" + telefone + '}';
    }
    
}
