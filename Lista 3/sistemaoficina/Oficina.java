package sistemaoficina;

import java.util.List;

public class Oficina {

    private List<OrdemServico> ordensServico;
	
        public Oficina (){};

    public void adicionaOS(OrdemServico os) {
	ordensServico.add(os);
	}
	
    public List<OrdemServico> buscaOSServico (int codigo){
	ordensServico.contains(codigo);
	return ordensServico;
	}

    public List<OrdemServico> buscaOSMecanico (String cpf){
    	ordensServico.contains(cpf);
        return ordensServico;
	}
	
    public double calculaFaturamentoTotal() {
        return "";
	}
	
    public String toString() {
    	return "";
	}

    public List<OrdemServico> getOrdensServico() {
	return ordensServico;
	}

    public void setOrdensServico(List<OrdemServico> ordensServico) {
	this.ordensServico = ordensServico;
	}
}