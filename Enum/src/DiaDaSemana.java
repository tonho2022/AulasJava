
public enum DiaDaSemana {
//lista de enums que recebem um valor inteiro
	DOMINGO(1), 
	SEGUNDA(2),
	TERCA(3), // Enums podem receber metodos e atributos
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	private int num;//variavel para o valor que os dias irão receber

	private DiaDaSemana(int num) {
		this.num = num;
	}

	public int getNum() {//puxando construtor privado
		return num;
	}
	
	
	
}
