
package orcamento;
        
import java.math.BigDecimal;
import java.text.DecimalFormat;
   
public class Real{
    private BigDecimal real;
    private static final String UNIDADE_MONETARIA = "R$ ";
    private static final DecimalFormat FORMATO = new DecimalFormat(UNIDADE_MONETARIA + " #,###,##0.00");
    
    public Real(String real){
        this.real = new BigDecimal (real);
    }
        
    public void somarRenda(String valorASomar){
        this.real = this.real.add(new BigDecimal(valorASomar));
    }
    
    public void subtrairRenda (String valorASubtrair){
        this.real = this.real.subtract(new BigDecimal(valorASubtrair));
    }
    
    public BigDecimal getReal(){
        return real;
    }
    
    public String getValorFormatado(){
        return FORMATO.format(real);
    }
    
}

