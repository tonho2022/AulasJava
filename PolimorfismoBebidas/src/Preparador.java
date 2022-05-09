
public class Preparador extends Bebida{

	public Preparador() {
		super("Leite Quente ", true);
		
	}

	public void prepararBebida(Bebida bebida) {
		
	
		
		System.out.println("Preparando bebida " + bebida.getNome());
		bebida.preparar();
		
		if(bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome());
			
			
		}
		System.out.println("Bebida preparada com sucesso!! \n");
		
	}

}
	

