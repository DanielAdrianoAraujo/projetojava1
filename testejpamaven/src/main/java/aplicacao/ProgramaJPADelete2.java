package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class ProgramaJPADelete2 {

	public static void main(String[] args) {

		
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);	
		
		System.out.println(p);
		
		System.out.println();
		System.out.println("Selecionado!");
		em.close();
		emf.close();
	}

}
