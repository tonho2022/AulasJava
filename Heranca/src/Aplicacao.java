
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();//criando objeto veiculo do tipo veiculo
		
		veiculo.setMarca("Porshe");//colocando atributos que podemos colocar por ultilizar metodos getter and setters
		veiculo.setModelo("cayenne");
		veiculo.setAno(2020);
		
		veiculo.imprimir(); //acessando os metodos
		veiculo.buzinar();
		
		Carro carro = new Carro(); //criando um objeto carro do tipo carro
		carro.setMarca("Porshe");
		carro.setModelo("cayenne");//colocando atributos que podemos colocar por ultilizar metodos getter and setters
		carro.setAno(2020);
		carro.setQuatroPortas(true);
		System.out.println();
		
		carro.imprimir();//acessando os metodos
		carro.buzinar();
		
		Caminhao caminhao = new Caminhao();
		caminhao.setMarca("Mercedes");
		caminhao.setModelo("XJT76");
		caminhao.setAno(2015);//colocando atributos que podemos colocar por ultilizar metodos getter and setters
		System.out.println();
		
		caminhao.imprimir();//acessando os metodos
		caminhao.buzinar();
		
		Moto moto= new Moto();
		moto.setMarca("bmw");
		moto.setModelo("f800");//colocando atributos que podemos colocar por ultilizar metodos getter and setters
		moto.setAno(2011);
		System.out.println();//syso sem nada para pular linha na hora de mostrar no console
		
		moto.imprimir();
		moto.empinar();//acessando os metodos
	}

}
