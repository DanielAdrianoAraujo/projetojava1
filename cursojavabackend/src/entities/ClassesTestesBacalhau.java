package entities;

public class ClassesTestesBacalhau {

	private String nome;
	private int contador;
	
	public ClassesTestesBacalhau() {
	}
	
	public ClassesTestesBacalhau(String nome, int contador) {
		this.nome = nome;
		this.contador = contador;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	

	// metodo que não recebe e não retorna, apenas grava na memoria
	public void completaNome() {
		this.nome = "Daniel Araujo"; 
	}
	
	
	// metodo que recebe e não retorna, e seta na memoria o recebido
	public void completaNome2 (String nome) {
		this.nome = nome;
	}

	public String completaNome3() {
		return "Araujo";
	}
	
	public int cont(int valor) {
		return contador += valor;
	}
	
	
	
}
