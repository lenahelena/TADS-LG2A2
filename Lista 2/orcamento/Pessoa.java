package orcamento;

public class Pessoa {
    private String nome;
    private int idade;
    private double renda;
    private double gastos;
    private double rendaMes;
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
        else{(rendaMes < 0)
            System.out.println("Terminou o mês com saldo negativo.");
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