
public class Aplicacao {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	
	Matematica matematica= new Matematica();
	
	System.out.println("Somar dois numeros");
	System.out.println("Digite o primeiro numero");
	int x =scanner.nextInt()
			
			System.out.println("Digite o segundo numero");
	int y = scanner.nextInt()
	
	int soma = matematica.somar(3, 4);
	System.out.println("o resultado da soma � " + soma +"!!!");
	
	soma= matematica.somar(3, 4, 5);
	System.out.println("o resultado � "+ soma +"!!!");

	double somar2= matematica.somar(3.5, 4);
	System.out.println("o resultado � " + somar2 +"!!!");
	
	System.out.println();
	}

}
