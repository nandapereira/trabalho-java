
public abstract class Atendimento {
    protected int numero;
    protected String cliente;
    protected String pedido;
    
    public void setNumero(int numero) {
	this.numero = numero;
    }
    public int getNumero() {
	return numero;
    }
    
    
    public String getCliente() {
	return cliente;
    }

    public void setCliente(String cliente) {
	this.cliente = cliente;
    }
    
    public String getPedido() {
	return pedido;
    }

    public void setPedido(String pedido) {
	this.pedido = pedido;
    }
    
    public String toString() {
        return "Reserva [: " + numero +", pedido: " + pedido + ", cliente: " + cliente+"]";
    }
}