
package aula02;
public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.modelo = "Sakura";
        c1.tampada = false;
        
        
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.ponta = 1;
        c2.modelo = "Hikari";
        c2.tampada = true;
        
        c2.status();
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
    
}
