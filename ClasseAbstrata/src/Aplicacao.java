
public class Aplicacao {

	public static void main(String[] args) {
	
	//	Item item = new Item(); Não tem como instanciar pq é de uma classe abstrata
		
		Item item= new Cogumelo();
		item.pegar();
		
		item = new Moeda();
		item.pegar();
		
		item = new Diamante();
		item.pegar();

	}

}
