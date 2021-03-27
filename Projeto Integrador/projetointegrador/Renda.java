
package projetointegrador;

import java.math.BigDecimal;


public class Renda {
    private BigDecimal renda;
    private BigDecimal salario;
    private BigDecimal rendaMes;
    
    public Renda(BigDecimal renda, BigDecimal salario, BigDecimal rendaMes){
        this.renda = renda;
        this.salario = salario;
        this.rendaMes = rendaMes;
    }   

    public void rendaTotal(){
        rendaMes = salario.add(renda);
    } 
    
    public BigDecimal getRenda() {
        return renda;
    }

    public void setRenda(BigDecimal renda) {
        this.renda = renda;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal getRendaMes() {
        return rendaMes;
    }

    public void setRendaMes(BigDecimal rendaMes) {
        this.rendaMes = rendaMes;
    }
    
    
}
