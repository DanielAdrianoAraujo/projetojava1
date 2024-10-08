package entities;

public class Alunos {
	
	private int codigoUnico;

	public Alunos(int codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public int getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(int codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	@Override
	public String toString() {
		return "Alunos [codigoUnico=" + codigoUnico + "]";
	}

	
	
	
	
	
}
