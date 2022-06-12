
public class Cachorro extends Animal{//usando extends para herdar da superclasse animal

	@Override
	public void falar() {//override do metodo falar que ja existe em outra classe
		System.out.println("AUAU");
	}
	public void Morder() {//criando metodo para a classe cachorro
		System.out.println("NHAC");
	}

}
