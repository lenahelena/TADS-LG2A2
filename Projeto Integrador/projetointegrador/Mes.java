package projetointegrador;


public enum Mes {
    JANEIRO(1), FEVEREIRO(2), MARCO(3), ABRIL(4), MAIO(5), JUNHO(6), JULHO(7), AGOSTO(8), SETEMBRO(9),
    OUTUBRO(10), NOVEMBRO(11), DEZEMBRO(12);
    
    private final int valor;
    
    Mes(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return this.valor;
    }
}