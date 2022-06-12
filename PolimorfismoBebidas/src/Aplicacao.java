
public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador();
		
		LeiteQuente leiteQuente = new LeiteQuente();
	preparador.prepararBebida(leiteQuente);//puxar o método preparar bebida da subclasse 
		
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);
		

	}

}
