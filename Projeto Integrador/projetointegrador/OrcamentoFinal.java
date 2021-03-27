package projetointegrador;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;


public class OrcamentoFinal {

    private static String rendaMes;

    public static void main(String[] args) {
            
        LocalTime horaAgora = LocalTime.now();
        LocalDate dataHoje = LocalDate.now();
        
        Mes m1 = Mes.JANEIRO;
        Pessoa p1 = new Pessoa("Helena", "22632861870", 3100, 2200);
        
        
        
        System.out.println(p1.getNome() + " - CPF: " + p1.getCpf());
        System.out.println("Consulta Extrato mês "+m1.toString() + " - " + m1.getValor());
        System.out.println("Consulta realizada as " + horaAgora + " no dia " + dataHoje);
        System.out.println("\nValor total da renda no mês: R$ "+ p1.getRenda()+"\n");
        System.out.println("Valor total de gastos no mês: R$ "+ p1.getGastos()+"\n");
        System.out.println("Valor total do extrato no mês: R$ "+ p1.calculaRenda()+"\n");
 

               
    }
    
}
