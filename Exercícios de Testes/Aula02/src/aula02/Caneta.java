
package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.print("Uma caneta " + this.cor);
        System.out.print(" do modelo " + this.modelo);
        System.out.print(" com a ponta " + this.ponta);
        System.out.println(" está tampada? " + this.tampada);
    }
    
    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    void rabiscar(){
        if (tampada == true){
            System.out.println("Erro, não posso rabiscar.");
        }else{
            System.out.println("Estou rabiscando!");
        }
    }
        
}