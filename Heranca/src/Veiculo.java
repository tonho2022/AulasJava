
public class Veiculo  {

//	private String nome;
	protected String marca;
	protected String modelo;
	protected int ano;
	
	public void buzinar() {//criando o metodo buzinar para a superclasse veiculo
		System.out.println("BI BI");//mensagem que sera exibida na execução do programa
	}

	public void imprimir() {
		System.out.println("Marca:"+ marca);
		System.out.println("Modelo: "+ modelo);
		System.out.println("Ano: "+ ano);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}						//colocando gettes and setters para poder acessar valores privados da classe main

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
