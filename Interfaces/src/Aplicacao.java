
public class Aplicacao {

	public static void main(String[] args) {
	//	Rota rota= new Rota();
		Ferrari ferrari = new Ferrari();//instanciando os objetos
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
		//chamando a classe vendedor com o método mostrar preco e dentro do parenteses podemos ver qual o item que tera o valor mostrado
		vendedor.mostrarPreco(apartamento);
		System.out.println();
		vendedor.mostrarPreco(ferrari);
		
	}

}
