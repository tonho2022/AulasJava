
public class main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();// Criando a variavel e instanciando o objeto pessoa1//
		System.out.println(pessoa1);

		pessoa1.nome = "Antonio";
		pessoa1.numFigurinhas = 1;

		pessoa1.receber(3);

		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);

		Pessoa pessoa2 = new Pessoa();

		pessoa2.nome = "Giovana";
		pessoa2.numFigurinhas = 3;

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas);

		boolean retorno = pessoa1.dar(5, pessoa2);
		if (retorno == true) {

		System.out.println("depois");

			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.numFigurinhas);

			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.numFigurinhas);

		}

	}

}
