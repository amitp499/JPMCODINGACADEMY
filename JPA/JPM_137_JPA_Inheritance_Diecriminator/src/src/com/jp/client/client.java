package src.com.jp.client;

import javax.persistence.EntityManager;



public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			EntityManager em = src.com.jp.util.JPAUtil.getEntityManager();
			
			em.getTransaction().begin();
			
			src.com.jp.entity.Employee emp = new src.com.jp.entity.Employee("Amit", 199.99);
			
			
			//emp.setEmpName("Amit");
			//emp.setEmpSal(199.99);
			
			src.com.jp.entity.Manager mgr = new src.com.jp.entity.Manager("Sunil",888.50, 700.50);
			
			src.com.jp.entity.Sales sls = new src.com.jp.entity.Sales("Nikita",188.50, 1700.50, 2500.00);
			
			em.persist(emp);
			em.persist(mgr);
			em.persist(sls);
			
			em.getTransaction().commit();
			em.close();
	}

}
