
public class Carro extends Veiculo{

private boolean quatroPortas;

	
	@Override
public void imprimir() {
	
	super.imprimir();
	System.out.println("Tem quatro portas " + quatroPortas);
}

	

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
}
