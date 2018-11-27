
public class AtendimentoDomicilio extends Atendimento {
    String bairro;
    String rua;
    String numeroCasa;
    
    public String getBairro() {
    	return bairro;
    }

    public void setBairro(String bairro) {
    	this.bairro = bairro;
    }
    
    public String getRua() {
    	return rua;
    }

    public void setRua(String rua) {
    	this.rua = rua;
    }
    public String getNumeroCasa() {
    	return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
    	this.numeroCasa = numeroCasa;
    }
   
    @Override
    public String toString() {
        return "Reserva [: " + numero +", pedido: " + pedido + ", cliente: " + cliente+",bairro"+bairro+",rua"+rua+",numero da residência"+numeroCasa+"]";
    }
}
