
package orcamento;


public enum Dias {
    DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SÁBADO(7);
    
    private int valor;
    
    Dias(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
    return this.valor;
    }
}