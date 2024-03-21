package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Daniel");
		aluno.setDataNascimento("17/03/1979");
		aluno.setIdade(21);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Adriano");
		diretor.setTempoDirecao(5);
		diretor.setIdade(17);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Araujo");
		secretario.setNivelCargo("Senior");
		secretario.setIdade(25);
		
		System.out.println(aluno);
		System.out.println();
		System.out.println(diretor);
		System.out.println();
		System.out.println(secretario);
		System.out.println();
		
		System.out.println(aluno.getIdade() + " - " + aluno.pessoaMaiorIdade()
		+ " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.getIdade() + " - " + diretor.pessoaMaiorIdade());
		System.out.println(secretario.getIdade() + " - " + secretario.pessoaMaiorIdade());
				
		System.out.println("Salario eh: " + aluno.salario());
		System.out.println("Salario eh :" + diretor.salario());
		System.out.println("Salario eh :" + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	
		public static void teste(Pessoa pessoa) {
			System.out.println("Essa pessoa eh: " +
			pessoa.getNome() + " Salario: " + pessoa.salario());
		} 
		
	
}
