
public class Pessoa {

	String nome;//criando variaveis
	int numFigurinhas;

	void receber(int numfigurinhas) {
		this.numFigurinhas += numfigurinhas;
	}
		
		boolean dar(int numFigurinhas, Pessoa pessoa) {
		
		
	if(this.numFigurinhas<numFigurinhas) {//colocando o se senao para o metodo ser executado se tal coisa acontecer
		System.out.println("Você não tem a quantidade nescessaria de figurinhas ");
		return false;
				
		
	}
	else {
	this.numFigurinhas -= numFigurinhas;
	pessoa.receber(numFigurinhas);
	return true;
	}
	}
}

