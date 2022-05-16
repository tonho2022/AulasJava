
public class Circulo implements AreaCalculavel {
	
	int raio = 15;
	double pi=3.14;
	@Override
	public void CalcularArea() {
		
	double area;
	area =raio*pi/2;
	System.out.println("O diametro do circulo é de "+ area+"cm");
		
	}
	
	

}
