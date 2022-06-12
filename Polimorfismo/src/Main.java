
public class Main {

	public static void main(String[] args) {
		
		//Animal animal= new Cachorro();
		//animal.falar();
		
	//	animal= new Gato();
	//	animal.falar();
		
		Gato gato=new Gato ();
		Cachorro cachorro= new Cachorro ();//criando novos objetos
		falar(gato);
		falar(cachorro);//chamando o metodo falar e especificando de qual classe eu quero puxar

	}
	public static void falar (Animal a) {
		a.falar();
		
		if(a instanceof Cachorro) {
	Cachorro c = (Cachorro) a;	
		c.Morder();
		}
	}

}
