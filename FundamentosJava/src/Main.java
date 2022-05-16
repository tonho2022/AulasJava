import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//int x = 100;
		//double y = 200.3;
		//int a = 0;
	//	double b = 0;
		//short z = (short)10000;
		//System.out.println(z);
		
	//	a = (int)y;
	//	b = x;
		
	//	System.out.println(a);
	//	System.out.println(b);
		
//		int idadePessoa = 60;
//		if(idadePessoa < 18) {
//			System.out.println("Você não pode beber");
//		}
//		else if(idadePessoa<60) {
//			System.out.println("Bora tomar uma ");
//		}else {
//			System.out.println("Você é da terceira idade");
//		}
//		
//			
//		System.out.println("Você tem " + idadePessoa + " anos");	
//		
//		int num = 8;
//		
//	switch (num) {
//	case 1:
//		System.out.println("domingo");
//		break;
//	case 2:
//		System.out.println("segunda");
//		break;
//	case 3:
//		System.out.println("terça");
//		break;
//	case 4:
//		System.out.println("quarta");
//		break;
//	case 5:
//		System.out.println("quinta");
//	break;	
//	case 6:
//		System.out.println("sexta");
//	break;	
//	case 7:
//		System.out.println("sabado");
//	break;	
//	default:
//	System.out.println("esse numero n representa um dia da semana");
//		}
	
//	char caractere = 'a';
//	
//	switch(caractere) {
//		case 'a':
//			System.out.println("seu caracter é a");
//			break;
//		case 'b':
//		System.out.println("seu caracter é b");
//		break;
//		default:
//		System.out.println("valor invalido ");
//	}
//}
//}
//String farol = "verde";
//switch(farol) {
//case "verde":
//System.out.println("Siga");
//break;
//case "amarelo":
//	System.out.println("tenha atenção");
//	break;
//case "vermelho":
//	System.out.println("PARE!");
//	break;
//	defalt:
//		System.out.println("valor invalido");
//		break;
//	}
	
//	int x = 0;//primeiro faz depois testa
//	while (x==10) {
//	System.out.println(x);
//	x=x+1; 
//		
//		
//	}
//	x=0;//primeiro testa depois executa 
//	do {
//		System.out.println(x);
//		x=x+1; 
//	}while(x<10);
		
	//	Scanner entrada = new Scanner (System.in);
	//	System.out.println("Digite um numero qualquer");
	//	int y = entrada.nextInt();
		
	//	for (int x=0; x<22; x+=2){
		//	System.out.println("2 x "+ x +" = "+x*2);
		
		
		int x1 = 3;
		int y1 = 5;
		int z1 = 7;
		
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(z1);
		System.out.println();
		
		double x[] = {3,5,3,7};
		
		for(int aux = 0; aux < x.length; aux++) {
			
			System.out.println("Valor do indice "+ aux + " = " + x[aux]);
		
		}
		String nome[] = {"Antonio","Heitor","Flora"};
		
		for(int aux1 = 0; aux1 < nome.length; aux1++) {
			
			System.out.println(nome[aux1]);
			if(nome[aux1] == "Heitor") {
				System.out.println("O indice do Heitor é = " + aux1);
			}
			
		}
		
		int[] arrayInt = new int [5];
				String[] ArrayString = new String [4];
				double[] ArrayDouble = new double[3];
				
				arrayInt[3] = 4;
				int[] numero = new int [6];
				Scanner teclado = new Scanner(System.in);

				for (int aux2 = 0; aux2 < numero.length; aux2++) {
					System.out.println("digite um numero Qualquer");
					numero[aux2] = teclado.nextInt();
				}
				
				
				for (int aux2 = 0; aux2 < numero.length; aux2++) {
				System.out.println("Indice " +aux2+ " = " + numero [aux2]);
					
				}
				
	}
}
