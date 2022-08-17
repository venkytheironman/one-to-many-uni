import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		List<Sim> sims =new ArrayList<Sim>();
		
		
		Mobile mobile = new Mobile();
		mobile.setName("One+8T");
		mobile.setCost(1245);
		
		Sim sim = new Sim();
		sim.setImrc(1234);
		sim.setProvider("Vodafone");
		sims.add(sim);
		
		mobile.setSim(sims);
		
		
		transaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim);
		transaction.commit();
	
		
		

	}

}
