package projetointegrador;

public enum TipoGastos {
    AGUA, LUZ, TELEFONE, INTERNET, ALUGUEL, COMPRASMERCADO, RESTAURANTE, OUTROS;
    
    private final String valor;
    
    TipoGastos(String valor){
        this.valor = valor;
    }
    
    public String getValor(){
        return this.valor;
    }
}
