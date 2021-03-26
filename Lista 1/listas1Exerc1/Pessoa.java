
package listas1Exerc1;

public class Pessoa {
    private String nome;
    private float altura;
    private int anoDeNascimento;
    private int resultado;

    public Pessoa(String nome, float altura, int anoDeNascimento){
        this.nome = nome;
        this.altura = altura;
        this.anoDeNascimento = anoDeNascimento;
    }
        
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }
    
    
       
    
    public int calculoIdade(){
        resultado = 2021 - anoDeNascimento;
        return resultado;
    }
    
}
