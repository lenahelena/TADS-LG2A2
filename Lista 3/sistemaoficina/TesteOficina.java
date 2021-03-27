package sistemaoficina;

public class TesteOficina {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Helena Brito", "22233344455", "11998887758");
	Cliente cliente2 = new Cliente("Maria Cristina", "22632861880", "71997755845");
	Cliente cliente3 = new Cliente ("Célio Fukuoka", "15454554580", "61999999999");
		
	Mecanico m1 = new Mecanico ("Rogério", "15454585890", "Troca de Oleo");
	Mecanico m2 = new Mecanico ("Roger", "12552536580", "Alinhamento");
	Mecanico m3 = new Mecanico ("Rodrigo", "36985274125", "Revisao");
		
	Oficina ofc1 = new Oficina();
	Oficina ofc2 = new Oficina();
	Oficina ofc3 = new Oficina();
	
	Servico servico1 = new Servico(1, "Troca de Oleo", 149.00);
	Servico servico2 = new Servico(2, "Alinhamento", 100.00);
	Servico servico3 = new Servico(3, "Revisao", 200.00);
		
	OrdemServico ordemServico1 = new OrdemServico(1, cliente1 );
	OrdemServico ordemServico2 = new OrdemServico(3, cliente2);
	OrdemServico ordemServico3 = new OrdemServico(5, cliente3);
		
    }

}