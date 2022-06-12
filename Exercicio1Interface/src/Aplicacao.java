
public class main {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();//criando objeto quadrado
		quadrado.setY(8);
		quadrado.calcularArea();//puxando metodo calcular area
		
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.setR(3);//acessando os metodos getter and setters que foram criados em suas respectivas classes
		circunferencia.getR();
		circunferencia.calcularArea();
		
		Retangulo retangulo = new Retangulo();
		retangulo.setB(7);
		retangulo.setH(12);
		retangulo.calcularArea();
	}
}
