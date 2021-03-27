package projetointegrador;

public class Pessoa {
    private String nome;
    private String cpf;
    private double renda;
    private double gastos;
    private double rendaMes;
    
    public Pessoa(String nome, String cpf, double renda, double gastos){
        this.nome = nome;
        this.cpf = cpf;
        this.renda = renda;
        this.gastos = gastos;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
    
    
    public double calculaRenda(){
        rendaMes = renda - gastos;
        if(rendaMes > 0){
            System.out.println("Terminou o mês com saldo positivo.");
        }
        else if(rendaMes < 0){
            System.out.println("Terminou o mês com saldo negativo.");
        }
        else{
            System.out.println("Terminou o mês com saldo zerado.");
        }
        return rendaMes;
}

    public double getRendaMes() {
        return rendaMes;
    }

    public void setRendaMes(double rendaMes) {
        this.rendaMes = rendaMes;
    }
    
    
}