import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws IOException {
		String s = "texto para ser gravado no arquivo";
		
	
		
		Mouse mouse1 = new Mouse(false, 2, "grande");
		Mouse mouse2 = new Mouse(true, 4, "médio");
		Mouse mouse3 = new Mouse (true, 8, "pequeno");
		
		 ArrayList<Mouse> ListaDeMouse = new ArrayList();
		  ListaDeMouse.add(mouse1);
		  ListaDeMouse.add(mouse2);
		  ListaDeMouse.add(mouse3);
		
		  try (BufferedWriter escrever = new BufferedWriter (new FileWriter("SAIDA.TXT"))){
			for (Mouse mouse :  ListaDeMouse) 
			escrever.write(mouse.toString());
		
	}

}
}





























