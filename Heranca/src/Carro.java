
public class Carro extends Veiculo{//extends pois herda a superclasse veiculo 

private boolean quatroPortas;

	
	@Override
public void imprimir() {//override pois o metodo buzinar ja existe em outras classes
	
	super.imprimir();
	System.out.println("Tem quatro portas " + quatroPortas);
}

	

	public boolean isQuatroPortas() {//ira retornar um valor boolean se tiver ou não tiver 4 portas
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
}
