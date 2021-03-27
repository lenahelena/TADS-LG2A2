
package projetointegrador;

import java.math.BigDecimal;

public class Gastos {
    private BigDecimal gastos;
    private String tipogastos;
    
    public Gastos(BigDecimal gastos, String tipogastos){
        this.gastos = gastos;
        this.tipogastos = tipogastos;
    }

    public BigDecimal getGastos() {
        return gastos;
    }

    public void setGastos(BigDecimal gastos) {
        this.gastos = gastos;
    }

    public String getTipogastos() {
        return tipogastos;
    }

    public void setTipogastos(String tipogastos) {
        this.tipogastos = tipogastos;
    }
    
    
    
    
}
