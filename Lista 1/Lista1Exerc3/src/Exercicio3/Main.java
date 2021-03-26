
package Exercicio3;


public class Main {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("SP3048802", "Helena de Brito", 8.8, 7.7, 7.5);
        
        System.out.println("Matricula:  " + aluno1.getMatricula());
        System.out.println("Nome:  " + aluno1.getNome());
        System.out.println("Nota Prova1:  " + aluno1.getProva1());
        System.out.println("Nota Prova2:  " + aluno1.getProva2());
        System.out.println("Nota do Trabalho:  " + aluno1.getTrabalho());
        
        System.out.println("Média das Notas:  " + aluno1.calculoMedia(aluno1.getProva1(), aluno1.getProva2(), aluno1.getTrabalho()));
        System.out.println("\nResultado:  " + aluno1.resultado(aluno1.calculoMedia(aluno1.getProva1(), aluno1.getProva2(), aluno1.getTrabalho())));
    }
}
