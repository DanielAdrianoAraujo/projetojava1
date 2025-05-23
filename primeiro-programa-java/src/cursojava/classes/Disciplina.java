package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {
	
	private double[] nota = new double[4];
	private String disciplina;
	
	
	
	
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplinax(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getMediaNota(){
		
		double somaTotal = 0;
		
		for (int pos = 0; pos < nota.length; pos++) {
			somaTotal += nota[pos];
		}
		return somaTotal / 4;
	}
	
	
	
	@Override
	public String toString() {
		return "Disciplina [nota=" + Arrays.toString(nota) + ", disciplina=" + disciplina + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(nota, other.nota);
	}
	
	
	
	
	
	
}
	
/*	Código Antigo
 * 
 *
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private String disciplina1;
	private String disciplina2;
	private String disciplina3;
	private String disciplina4;
	
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public String getDisciplina1() {
		return disciplina1;
	}
	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}
	public String getDisciplina2() {
		return disciplina2;
	}
	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}
	public String getDisciplina3() {
		return disciplina3;
	}
	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}
	public String getDisciplina4() {
		return disciplina4;
	}
	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}
	@Override
	public int hashCode() {
		return Objects.hash(disciplina1, disciplina2, disciplina3, disciplina4, nota1, nota2, nota3, nota4);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina1, other.disciplina1) && Objects.equals(disciplina2, other.disciplina2)
				&& Objects.equals(disciplina3, other.disciplina3) && Objects.equals(disciplina4, other.disciplina4)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4);
	}
	
	@Override
	public String toString() {
		return "Disciplina [nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4
				+ ", disciplina1=" + disciplina1 + ", disciplina2=" + disciplina2 + ", disciplina3=" + disciplina3
				+ ", disciplina4=" + disciplina4 + "]";
	}
	
	*/
	


