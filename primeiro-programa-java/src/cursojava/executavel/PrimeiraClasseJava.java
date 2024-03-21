package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.excecao.ExcecaoProcessarNota;


public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		try {
			
			lerArquivo();
			
	/*		try {
				File fil = new File("c://lines.txt");
				Scanner scanner = new Scanner(fil);
			} catch (FileNotFoundException e) {
				throw new ExcecaoProcessarNota("Putz Erro no Processamento"
						+ "do Arquivo");
			} */

		String login = JOptionPane.showInputDialog("Entre com o Login");
		String senha = JOptionPane.showInputDialog("Entre com a Senha");
		
		//FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
		
		//PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {
		
		//if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {

	//	if (login.equalsIgnoreCase("admin") && 
	//		senha.equalsIgnoreCase("admin")) {

			List<Aluno> alunos = new ArrayList<Aluno>();
	//		List<Aluno> alunos = null;
			/*
			 * List<Aluno> alunosAprovados = new ArrayList<Aluno>(); List<Aluno>
			 * alunosRecupercao = new ArrayList<Aluno>(); List<Aluno> alunosReprovados = new
			 * ArrayList<Aluno>();
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 1; qtd++) {

				String nome = JOptionPane.showInputDialog("Qual nome do Aluno ?");
				String idade = JOptionPane.showInputDialog("Qual a Idade ?"); 
				
				/*
				String dtnascimneto = JOptionPane.showInputDialog("Data Nascimento ?"); String rg =
				 * JOptionPane.showInputDialog("RG ?"); String cpf =
				 * JOptionPane.showInputDialog("CPF ?"); String mae =
				 * JOptionPane.showInputDialog("Mae ?"); String pai =
				 * JOptionPane.showInputDialog("Pai ?"); String dtMatricula =
				 * JOptionPane.showInputDialog("Data Matricula ?"); String escola =
				 * JOptionPane.showInputDialog("Escola ?"); String serie =
				 * JOptionPane.showInputDialog("Serie ?");
				 */
				/*
				 * String nota1 = JOptionPane.showInputDialog("Nota1 ?"); String nota2 =
				 * JOptionPane.showInputDialog("Nota2 ?"); String nota3 =
				 * JOptionPane.showInputDialog("Nota3 ?"); String nota4 =
				 * JOptionPane.showInputDialog("Nota4 ?"); String disciplina1 =
				 * JOptionPane.showInputDialog("Disciplina1 ?"); String disciplina2 =
				 * JOptionPane.showInputDialog("Disciplina2 ?"); String disciplina3 =
				 * JOptionPane.showInputDialog("Disciplina3 ?"); String disciplina4 =
				 * JOptionPane.showInputDialog("Disciplina4 ?");
				 */

				Aluno aluno1 = new Aluno(); // Instanciou/criou o Objeto Aluno
				aluno1.setNome(nome);
				aluno1.setIdade(Integer.valueOf(idade));
				 
				 /* aluno1.setDataNascimento(dtnascimneto); aluno1.setRegistroGeral(rg);
				 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
				 * aluno1.setDataMatricula(dtMatricula); aluno1.setNomeEscola(escola);
				 * aluno1.setSerieMatriculado(serie);
				 */

				for (int pos = 1; pos <= 1; pos++) {
					String nomedisci = JOptionPane.showInputDialog("Nome Disci " + pos);
					String notadisci = JOptionPane.showInputDialog("Nota Disci " + pos);

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplinax(nomedisci);
				//	disciplina.setNota(Double.valueOf(notadisci));

					aluno1.getDisciplinas().add(disciplina);

				}

				int escolha = JOptionPane.showConfirmDialog(null, "Remover Disciplina ?");

				if (escolha == 0) {

					int continuarRemover = 0;
					int posi = 1;

					while (continuarRemover == 0) {
						String diciRemover = JOptionPane.showInputDialog("1, 2, 3 ou 4 ?");
						aluno1.getDisciplinas().remove(Integer.valueOf(diciRemover).intValue() - posi);
						posi++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar ?");
					}
				}

				alunos.add(aluno1);

			}
// HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno alunoz : alunos) {

				if (alunoz.getAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(alunoz);
					// alunosAprovados.add(alunoz);
				} else {
					if (alunoz.getAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(alunoz);
						// alunosRecupercao.add(alunoz);
					} else {
						maps.get(StatusAluno.REPROVADO).add(alunoz);
						// alunosReprovados.add(alunoz);
					}
				}
			}

			for (Aluno aluno : alunos) {
				System.out.println("Aluno: " + aluno.getNome() + " => Media: " + aluno.getMedia() + " => Status: "
						+ aluno.getAprovado2());
			}

			System.out.println();
			System.out.println("------------------Aprovados---------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Aluno: " + aluno.getNome() + " Media: " + aluno.getMedia() + " Status: "
						+ aluno.getAprovado2());
			}

			System.out.println();
			System.out.println("------------------Recuperacao---------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Aluno: " + aluno.getNome() + " Media: " + aluno.getMedia() + " Status: "
						+ aluno.getAprovado2());
			}

			System.out.println();
			System.out.println("------------------Reprovado---------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Aluno: " + aluno.getNome() + " Media: " + aluno.getMedia() + " Status: "
						+ aluno.getAprovado2());
			}

		} else {
			
			JOptionPane.showMessageDialog(null, "Acesso não Permitido");
		}
		
		} catch (NumberFormatException e) {
			
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace();
			
			
			for (int i = 0; i < e.getStackTrace().length; i++) {
				
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n Metodo de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[i].getLineNumber());
			}
			
			JOptionPane.showInternalMessageDialog(null, "Erro de Conversao Numero"
					+ saida.toString());
			
		} catch (NullPointerException e) {
			
			JOptionPane.showInternalMessageDialog(null, "Opa deu ruim Null Pointer Exeption"
					+ e.getMessage());
		} catch (ExcecaoProcessarNota e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Erro da Exceção Customizada " + e.getMessage().getClass());
		
		}finally {
			JOptionPane.showMessageDialog(null, "Estamos Aprendendo Java");
		}
	}
	
	public static void lerArquivo() throws ExcecaoProcessarNota {
		try {
			File fil = new File("c://lines.txt");
			Scanner scanner = new Scanner(fil);
		} catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota(e.getMessage());
		} 
		
	}
}

/*
 * Troca de aluno
 * 
 * // for (int pos = 0; pos < alunos.size(); pos++) {
 * 
 * Aluno alunoy = alunos.get(pos);
 * 
 * if (alunoy.getNome().equalsIgnoreCase("Daniel")) { Aluno trocar = new
 * Aluno(); trocar.setNome("Fui Trocado");
 * 
 * Disciplina disc2 = new Disciplina(); disc2.setDisciplinax("Spring");
 * disc2.setNota(99);
 * 
 * trocar.getDisciplinas().add(disc2);
 * 
 * alunos.set(pos, trocar); alunoy = alunos.get(pos); }
 * 
 * System.out.println("Nome: " + alunoy.getNome());
 * System.out.println("Media do Aluno " + alunoy.getMedia());
 * System.out.println("Resultado " + alunoy.getAprovado2());
 * 
 * 
 * for (int posd = 0; posd < alunoy.getDisciplinas().size(); posd++) {
 * Disciplina disc = alunoy.getDisciplinas().get(posd);
 * System.out.println("Materia = " + disc.getDisciplina() + " / Nota = " +
 * disc.getNota());
 * 
 * } System.out.println("--------------------------------------");
 * 
 */
/*
 * for (Disciplina disc : alunoy.getDisciplinas()) {
 * System.out.println("Materia = " + disc.getDisciplina() + " / Nota = " +
 * disc.getNota()); }
 */

/*
 * for (Aluno alunox : alunos) {
 * 
 * if (alunox.getNome().equalsIgnoreCase("Daniel")) { alunos.remove(alunox);
 * break; } else { System.out.println(alunox);
 * System.out.println("Media Aluno: " + alunox.getMedia());
 * System.out.println("Resultado: " + alunox.getAprovado2());
 * System.out.println("************************************************"); } }
 * 
 * for (Aluno alunox : alunos) { System.out.println("Alunos que Sobraram");
 * System.out.println(alunox.getNome());
 * System.out.println("Suas Materias Sao: ");
 * 
 * for (Disciplina disciplinax : alunox.getDisciplinas()) {
 * System.out.println(disciplinax.getDisciplina());
 * 
 * } }
 */

//			System.out.println("Resultado: " + (aluno1.getAprovado() ? "Aprovado" : "Reprovado"));
/*
 * Disciplina disciplina1 = new Disciplina(); disciplina1.setDisciplinax("BD");
 * disciplina1.setNota(90);
 * 
 * aluno1.getDisciplinas().add(disciplina1);
 * 
 * Disciplina disciplina2 = new Disciplina();
 * disciplina2.setDisciplinax("Java"); disciplina2.setNota(90);
 * 
 * aluno1.getDisciplinas().add(disciplina2);
 * 
 * Disciplina disciplina3 = new Disciplina();
 * disciplina3.setDisciplinax("HTML"); disciplina3.setNota(90);
 * 
 * aluno1.getDisciplinas().add(disciplina2);
 * 
 * Disciplina disciplina4 = new Disciplina(); disciplina4.setDisciplinax("JS");
 * disciplina4.setNota(90);
 * 
 * aluno1.getDisciplinas().add(disciplina2);
 */

/*
 * aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
 * aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
 * aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
 * aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
 * aluno1.getDisciplina().setDisciplina1(disciplina1);
 * aluno1.getDisciplina().setDisciplina2(disciplina2);
 * aluno1.getDisciplina().setDisciplina3(disciplina3);
 * aluno1.getDisciplina().setDisciplina4(disciplina4);
 */

// Aluno banana = new Aluno(); /*Instaciou o Objeto Aluno*/
// banana.setNome("Jose");
// System.out.println("Nome: " + banana.getNome());

/*
 * System.out.println("Nome: " + aluno1.getNome()); System.out.println("Idade: "
 * + aluno1.getIdade()); System.out.println("DT Nascimento: " +
 * aluno1.getDataNascimento()); System.out.println("RG: " +
 * aluno1.getRegistroGeral()); System.out.println("CPF: " +
 * aluno1.getNumeroCpf()); System.out.println("Mae: " + aluno1.getNomeMae());
 * System.out.println("Pai: " + aluno1.getNomePai());
 * System.out.println("Data Matricula: " + aluno1.getDataMatricula());
 * System.out.println("Nome Escola: " + aluno1.getNomeEscola());
 * System.out.println("Serie: " + aluno1.getSerieMatriculado());
 */

// Equals and HashCode (Diferenciar Objetos)

/*
 * Aluno aluno1 = new Aluno(); aluno1.setNome("Daniel");
 * aluno1.setNumeroCpf("123");
 * 
 * Aluno aluno2 = new Aluno(); aluno2.setNome("Daniel");
 * aluno2.setNumeroCpf("123");
 * 
 * 
 * if (aluno1.equals(aluno2)) { System.out.println("Alunos Sao Iguais"); }else{
 * System.out.println("Alunos Sao Diferentes"); }
 */
