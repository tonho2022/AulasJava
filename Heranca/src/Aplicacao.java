
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Porshe");
		veiculo.setModelo("cayenne");
		veiculo.setAno(2020);
		
		veiculo.imprimir();
		veiculo.buzinar();
		
		Carro carro = new Carro();
		carro.setMarca("Porshe");
		carro.setModelo("cayenne");
		carro.setAno(2020);
		carro.setQuatroPortas(true);
		System.out.println();
		
		carro.imprimir();
		carro.buzinar();
		
		Caminhao caminhao = new Caminhao();
		caminhao.setMarca("Mercedes");
		caminhao.setModelo("XJT76");
		caminhao.setAno(2015);
		System.out.println();
		
		caminhao.imprimir();
		caminhao.buzinar();
		
		Moto moto= new Moto();
		moto.setMarca("bmw");
		moto.setModelo("f800");
		moto.setAno(2011);
		System.out.println();
		
		moto.imprimir();
		moto.empinar();
	}

}
