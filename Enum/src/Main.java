import java.util.Scanner;

public class Main {

	public static final double PI = 3.14;//constantes 
	
	private enum Sexo{
		MASCULINO,FEMININO;//criando enums
		
	}
	
	public static void main(String[] args) {

	double	pi = Main.PI;
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);
		
		String s = "TERCA";
		hoje =  DiaDaSemana.valueOf (s);//convertendo variavel Terca
		
		System.out.println(hoje.getNum());
		
		Sexo sexo = Sexo.FEMININO;
		 sexo = Sexo.MASCULINO;//chamando enum usando objeto
		

		
			
			int[] arrayInt = new int [5];
			String[] ArrayString = new String [4];
			double[] ArrayDouble = new double[3];
			
			arrayInt[3] = 4;
			int[] numero = new int [6];
			Scanner teclado = new Scanner(System.in);

			for (int aux2 = 0; aux2 < numero.length; aux2++) {
				System.out.println("digite um numero Qualquer");//usando for para criar um loop até o valor declarado (6)
				numero[aux2] = teclado.nextInt();
			}
			
			
			for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Indice " +aux2+ " = " + numero [aux2]);
				
			}
			
	}

}
