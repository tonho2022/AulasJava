
public class Bebida {
	//criando variaveis privadas
	private String nome;
	private boolean aquecer;
	public Bebida(String nome, boolean aquecer) {//criando um construtor
		super();
		this.nome = nome;
		this.aquecer = aquecer;
		
	}
	
	public void preparar() {//criando metodo preparar que não vai retornar
		System.out.println("Pegando copo");	
	
	}
	//metodos getters and setters para acessar os valores 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAquecer() {
		return aquecer;
	}
	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	

}
