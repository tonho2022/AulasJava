
public class Aplicacao {

	public static void main(String[] args) {
	
	//	Item item = new Item(); Não tem como instanciar pq é de uma classe abstrata
		
		Item item= new Cogumelo();//instanciando o objeto cogumelo e criei uma variavel item que sera usada para istanciar o resto dos objetos
		item.pegar();
		
		item = new Moeda();
		item.pegar();
		// instanciar o objeto moeda e o objeto diamante
		item = new Diamante();
		item.pegar();

	}

}
