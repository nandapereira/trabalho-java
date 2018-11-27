
public class AtendimentoPresencial extends Atendimento {
    
	String mesa;

	

	public String getMesa() {
		return mesa;
	}



	public void setMesa(String mesa) {
		this.mesa = mesa;
	}



	@Override
	public String toString() {
		return "AtendimentoPresencial [mesa=" + mesa + ", numero=" + numero + ", cliente=" + cliente + ", pedido="
				+ pedido + "]";
	}
	
	
    
    
}

