import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		String s = "texto para ser gravado no arquivo";
		
		try (BufferedWriter escrever = new BufferedWriter (new FileWriter("SAIDA.TXT"))){

		escrever.write(s);
		}
		
		
		
	}

}






























