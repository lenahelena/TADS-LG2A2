
package agenda;

public class Main {
    	public static void main(String[] args) {
		
        Agenda agenda1 = new Agenda("Helena", "helenalenabb@gmail.com");
	Contato contato1 = new Contato("Helena", "helenalenabb@gmail.com", "11983754708");
		
	Agenda agenda2 = new Agenda("Klaus", "klaus.dimitri3@gmail.com");
		
	Contato contato2 = new Contato ("Klaus", "helenalenabb@gmail.com", "1192228890");
		
	System.out.println(agenda1.getNome());
	System.out.println(agenda1.getEmail());
	System.out.println(contato1.getTelefone());
		
	System.out.println(agenda2.getNome());
	System.out.println(agenda2.getEmail());
	System.out.println(contato2.getTelefone());
	}

}