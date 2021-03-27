package sistemaoficina;

import java.util.List;

public class OrdemServico {

	private int codigo;
	private Cliente cliente;
	private List<Servico> servico;
	private List<Mecanico> mecanico;
	
	public OrdemServico (int codigo, Cliente cliente) {
		this.codigo = codigo;
		this.cliente = cliente;
	}
	
	public void adicionaServico(Servico servico) {
		
	}
	
	public void adicionaMecanico(Mecanico mecanico)	{
		
	}
	
	public double calculaValorTotal (){
		return 0;
	}
	
	public boolean possuiServico (int codigo){
		return true;
	}
	
	public boolean possuiMecanico (String cpf) {
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Servico> getServicos() {
		return servico;
	}

	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}

	public List<Mecanico> getMecanico() {
		return mecanico;
	}

	public void setMecanico(List<Mecanico> mecanico) {
		this.mecanico = mecanico;
	}
	
}