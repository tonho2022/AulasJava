import java.util.Scanner;

public class Main {

	public static final double PI = 3.14;
	
	private enum Sexo{
		MASCULINO,FEMININO;//criando um enum privado

		char[] getNum() {
			
			return null;
		}
		
	}
	
	public static void main(String[] args) {

	double	pi = Main.PI;

	Pessoa pessoa = new Pessoa();
	Endereco endereco;
		Sexo sexo = Sexo.FEMININO;
		 sexo = Sexo.MASCULINO;
		
		String[] arrayInt = new String [5];//criando um array 
		String[] ArrayString = new String [4];
		double[] ArrayDouble = new double[3];
		
		arrayInt[3] = MASCULINO;
		int[] numero = new int [6];
		Scanner teclado = new Scanner(System.in);//istanciando o scanner para receber valores do usuario

		for (int aux2 = 0; aux2 < numero.length; aux2++) {//colocando o for para fazer a repetição até o valor colocado no conchete
			System.out.println("Digite 1 para realizar o cadastro");
			numero[aux2] = teclado.nextInt();
		}
		
		
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
		System.out.println("Indice " +aux2+ " = " + numero [aux2]);
			
		}

	}

}
