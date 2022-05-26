
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException{
	try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){
		String line;
		String string = "";
		
		while((line = reader.readLine())!= null) {
			string += line + "\n";
		}
	
		System.out.println(string);
	}
		
	String teste = "Mouse: funciona = sim, qtdBotoes = 2, tamanho = pequeno\n";
	
	Mouse mouse = new Mouse (teste);
	
	System.out.println(mouse);
		
	}

}
