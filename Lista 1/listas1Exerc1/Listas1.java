
package listas1Exerc1;


public class Listas1 {

 
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Helena", (float) 1.58, 1987);
        
        System.out.println(p1.getNome());
        System.out.println(p1.getAltura());
        System.out.println(p1.getAnoDeNascimento());
        
        System.out.println(p1.calculoIdade());
    }
    
}
