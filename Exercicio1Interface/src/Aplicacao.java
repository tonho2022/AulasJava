
public class Aplicacao {

	public static void main(String[] args) {
		
		AreaCalculavel circulo = new Circulo();
		circulo.CalcularArea();
		
		AreaCalculavel retangulo = new Retangulo();
		retangulo.CalcularArea();
		
		AreaCalculavel triangulo = new Triangulo();
		triangulo.CalcularArea();

	}

}
