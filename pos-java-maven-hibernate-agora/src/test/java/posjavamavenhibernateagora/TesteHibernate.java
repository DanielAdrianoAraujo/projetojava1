package posjavamavenhibernateagora;

import org.junit.jupiter.api.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {
	
	@Test
	public void testeHibernateutil() {
		DaoGeneric<UsuarioPessoa> daogeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa  pessoa = new UsuarioPessoa();
		
		pessoa.setNome("Daniel");
		pessoa.setSobrenome("Araujo 3");
		pessoa.setLogin("Admin");
		pessoa.setSenha("Admin");
		pessoa.setIdade(45);
		pessoa.setEmail("daniel@gmail.com");
		
		daogeneric.salvar(pessoa);
		
		
	}
	
}
