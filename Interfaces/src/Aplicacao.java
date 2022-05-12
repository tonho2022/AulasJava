
public class Aplicacao {

	public static void main(String[] args) {
	//	Rota rota= new Rota();
		Ferrari ferrari = new Ferrari();
	//	Fusquinha fusquinha= new Fusquinha();
	//	rota.ir(ferrari);
		System.out.println();
		//rota.ir(fusquinha); 
		
		//Automovel automovel= new Ferrari();
	//	rota.ir(automovel);
		//automovel = new Fusquinha();
	//	rota.ir(automovel);
		
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);
		System.out.println();
		vendedor.mostrarPreco(ferrari);
		
	}

}
