
public class Circulo implements AreaCalculavel {
	
	private int r;
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public void calcularArea() {
		System.out.println("A área do Circulo é: " + Math.PI*Math.pow(r, 2));
	}

	

}
