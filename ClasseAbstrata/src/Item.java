
public abstract class Item {

	private int posX; //criando variaveis privadas
	private int posY;
	
	public abstract void pegar();//colocando metodo da classe abstrata pois ela esta sendo extendida
		
		
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) { //Usando os metodos getters e setters o metodo getter serve para retornar o valor da variavel e o setter para definir ou atualizar o valor
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
}
