
public class Pessoa {

	String nome;
	int numFigurinhas;

	void receber(int numfigurinhas) {
		this.numFigurinhas += numfigurinhas;
	}

	void dar (int numFigurinhas, Pessoa pessoa) {
		
		boolean dar(int numFigurinhas, Pessoa pessoa)
		
		
	if(this.numFigurinhas<numFigurinhas) {
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

