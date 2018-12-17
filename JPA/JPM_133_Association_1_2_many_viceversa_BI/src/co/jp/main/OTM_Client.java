package co.jp.main;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jp.entities.Department;
import com.jp.entities.Employee;
import com.jp.util.JPAUtil;

public class OTM_Client {

	public static void main(String[] args) {
		
		EntityManager em =JPAUtil.getEntityManager();
		
		/*Department d1 = new Department();
		
		d1.setDeptId(10L);
		d1.setDeptName("Sales");
		
		Employee e1 = new Employee();
		
		e1.setEmpId(101L);
		e1.setEmpName("Amit1");
		e1.setEmpsal(999.99);
		e1.setDepartment(d1);
		
		Employee e2 = new Employee();
		
		e2.setEmpId(102L);
		e2.setEmpName("Rohit1");
		e2.setEmpsal(599.99);
		e2.setDepartment(d1);
		
		Set<Employee> employees = new HashSet<>();
		
		employees.add(e1);
		employees.add(e2);
		
		d1.setEmployees(employees);
*/		
		//Department d2 = em.find(Department.class,13L); // deleting a department id , deletes all the employes with that dept id
		
		Department d3 = em.find(Department.class,10L); // deleting a department id , deletes all the employes with that dept id
		d3.setDeptId(13L);
		d3.setDeptName("IT");
		
		em.getTransaction().begin();

		//em.remove(d2);
		em.merge(d3);
		
			
		em.getTransaction().commit();
		
		em.close();
	}

}
