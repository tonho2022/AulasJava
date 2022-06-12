import java.io.FileReader;//importando as bibliotecas do java para usar seus metodos
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);//instanciando scanner
		String string = scanner.nextLine();
	
	
		
		try (BufferedWriter escrever = new BufferedWriter (new FileWriter("Saida.txt"))){//usando metodo para escrever dentro de um txt
			
			escrever.write(string);
		
	}

		  
		  try(BufferedReader reader = new BufferedReader(new FileReader("Saida.txt"))){//puxando metodo reader para ler oque esta escrito no txt
		
			  String line;
				String string2 = "";
				
				while((line = reader.readLine())!= null) {
					string2 += line + "\n";
				}
			
				System.out.println(string2);
			}
		

	}

}
