package br.com.caelum.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static  EntityManagerFactory emf ;
	
	public static EntityManagerFactory getEntityManager() {
			if(emf == null) {
				emf = Persistence.createEntityManagerFactory("contas-oracle");
			}
		return emf;
	}

}
