
public class Mouse {
 
	private boolean funciona; //criando os atributos do meu objeto
	private int qtdBotoes;
	private String tamanho;
	
	
	public Mouse(boolean funciona, int qtdBotoes, String tamanho) {
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;//instanciando variaveis para receber as informações
		this.tamanho = tamanho;
	}
	@Override
	public String toString() {
		return "Mouse [funciona=" + funciona + ", qtdBotoes=" + qtdBotoes + ", tamanho=" + tamanho +  "]" + "\n";//override com to string para puxar esse metodo desta classe
	}
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	public int getQtdBotoes() {
		return qtdBotoes;                                       //getters and setters dos valores do nosso objeto
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
