package posjavamavenhibernateagora;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	
	public static EntityManagerFactory factory = null;
	
	static {
		init();
		}
	
	private static void init() {
		
		try {
			
			if (factory == null) {
				factory = Persistence.createEntityManagerFactory("pos-java-maven-hibernate-agora");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager(); // Prove a persistencia
		
	}
	
	public static Object getPrimaryKey(Object entity) { // Retorna a Primary Key
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
		
		
	}
	
	
}
