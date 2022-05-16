
public class Triangulo implements AreaCalculavel {

int base=16;
int altura=12;
	
	
	
	
	@Override
	public void CalcularArea() {
		int area;
		area=base*altura/2;
		System.out.println("A area do trianguo é "+ area +"cm2");
		
	}


			
	
}
