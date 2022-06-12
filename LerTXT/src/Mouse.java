public class Mouse {
 
	private boolean funciona;//criando variaveis privadas
	private int qtdBotoes;
	private String tamanho;
	
	
	public Mouse(boolean funciona, int qtdBotoes, String tamanho) {
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;//criando atributos do objeto mouse
		this.tamanho = tamanho;
	}
	@Override
	public String toString() {//override no to metodo to string 
		return "Mouse [funciona=" + funciona + ", qtdBotoes=" + qtdBotoes + ", tamanho=" + tamanho +  "]" + "\n";
	}
	public Mouse (String texto) {
		String[]arrayAuxiliar1= texto.split(",");
		String[]arrayAuxiliar2 = arrayAuxiliar[0].split("=");//array para repetir os metodos 
		this.funciona=arrayAuxiliar[1].trim();
		
		String[] arrayAuxiliar3=arrayAuxiliar1[1].split("=");
		this.qtdBotoes=arrayAuxiliar3[1].trim();
		
		String[]arrayAuxiliar4=arrayAuxiliar1[2].split(",");
		this.tamanho = arrayAuxiliar4[1].trim();
		
		}
	//puxando metodos getters and setters para acessar as variaveis privadas
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	public int getQtdBotoes() {
		return qtdBotoes;
	}
	public void setQtdBotoes(int qtdBotoes) {
		this.qtdBotoes = qtdBotoes;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
}
