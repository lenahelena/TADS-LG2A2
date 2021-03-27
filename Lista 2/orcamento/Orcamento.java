
package orcamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;


public class Orcamento {

    public static void main(String[] args) {
        LocalTime horaAgora = LocalTime.now();
        LocalDate dataHoje = LocalDate.now();
        
        Mes m1 = Mes.NOVEMBRO;
        Pessoa p1 = new Pessoa();
        p1.setNome("Helena");
        p1.setIdade(33);
        p1.setRenda(200.00);
        p1.setGastos(200.00);
        
        p1.calculaRenda();
        
        BigDecimal _renda = new BigDecimal("200.00");
        BigDecimal _gastos = new BigDecimal("200.00");
        BigDecimal _rendaMes = _renda.subtract(_gastos);
        
        System.out.println(p1.getNome() + " - " + p1.getIdade()+ " anos");
        System.out.println("Consulta Extrato mês "+m1.toString() + " - " + m1.getValor());
        System.out.println("Consulta realizada as " + horaAgora + " no dia " + dataHoje);
        System.out.println("Valor total da renda no mês: R$ "+ _rendaMes+"\n");
           
        
    }
    
}
