
package sistemaoficina;

public class Mecanino extends Pessoa {
    
    private String especialidade;
  
    public Mecanino (String cpf, String nome, String especialidade){
        super.setCpf(cpf);
        super.setNome(nome);
        this.especialidade = especialidade;
    }
    
    public String getEspecialidade(){
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    
    @Override
    public String toString(){
        return "Nome: " + super.getNome() + " Especialidade: " + especialidade;
    }
    
}