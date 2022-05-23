import java.util.Scanner;

public class Main {

	public static final double PI = 3.14;
	
	private enum Sexo{
		MASCULINO,FEMININO;

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
		
		String[] arrayInt = new String [5];
		String[] ArrayString = new String [4];
		double[] ArrayDouble = new double[3];
		
		arrayInt[3] = MASCULINO;
		int[] numero = new int [6];
		Scanner teclado = new Scanner(System.in);

		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Digite 1 para realizar o cadastro");
			numero[aux2] = teclado.nextInt();
		}
		
		
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
		System.out.println("Indice " +aux2+ " = " + numero [aux2]);
			
		}

	}

}
