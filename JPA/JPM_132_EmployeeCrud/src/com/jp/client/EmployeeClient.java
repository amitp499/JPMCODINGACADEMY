/**
 * 
 */
package com.jp.client;

import java.util.List;
import java.util.Scanner;

import com.jp.entities.Employee;
import com.jp.exception.EmployeeException;
import com.jp.service.EmployeeService;
import com.jp.service.IEmployeeService;

/**
 * @author brije
 *
 */
public class EmployeeClient {
	//prep-work
		//ref of service layer interface
		private static IEmployeeService employeeService;
		private static Long empId;
		private static Employee employee;
		private static Scanner sc ;
		private static int choice;
		//static block
		static {
			// obj of service layer impl class
			employeeService = new EmployeeService();
			sc = new Scanner(System.in);
			choice = 0;
		}
	public static void main(String[] args) {
		try {
			while (true) {		
				//prompting the user to enter his choice
				switchMenuChoice();				
			}
		} catch (EmployeeException e) {
			System.err.println(
					  "\n=====================Something Went Wrong====================================================================================\n"
					+ "\n             Kindly Enter your choice Again!!\n"
					+ "\n======================================================================================================================================\n");
			//switchMenuChoice();
		}	
	}

	private static void switchMenuChoice() throws EmployeeException {
		choice=showMenu();
		switch (choice) {
		case 1:
			add();
			break;
		case 2:
			list();
			break;
		case 3:
			update();
			break;
		case 4:
			delete();
			break;
		case 5:
			search();
			break;
		case 6:
			end();
			break;

		default:
			System.err.println(
					  "\n=====================You have entered wrong choice====================================================================================\n"
					+ "\n             Kindly Enter your choice Again!!\n"
					+ "\n======================================================================================================================================\n");
			break;
		}			
	}

	private static int showMenu() throws EmployeeException{
		System.out.println(
				   "\n===================Employee Services Menu=========================================================================================================================\n"

				+ " \n    Select option from (1- 5) And 6 to Exit Application \n" 
				+ " \n==================================================================================================================================================================\n"
				+ " \n                   1.  Add Employee"
				+ " \n                   2.  List Employee" 
				+ " \n                   3.  Update Employee"
				+ " \n                   4.  Delete Employee" 
				+ " \n                   5.  Search Employee"
				+ " \n                   6.  Exit Employee App"
				+ "\n===================================================================================================================================================================\n");
	
		try {
			choice = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Input can be only nummeric value.....");
			//showMenu();
		}
		return choice;
	}

	private static void add() throws EmployeeException {
		
		Employee employee= new Employee();//transient state
		System.out.println("Enter Employee Name to be added");
		employee.setName(sc.next());
		System.out.println("Enter Employee Salary to be added");
		employee.setSalary(sc.nextDouble());
		//call the service method to add employee
		Long empId = employeeService.addEmployee(employee);
		if(empId>0) {
			System.out.println("Employee Record Persisted successfully with unique Employee Id : "+empId);
		}else {
		System.err.println("Sorry !!! Employee Record NOT Persisted ");
		}
	}

	

	private static void update() throws EmployeeException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Employee Id to be updated");
		
		Long id = sc.nextLong();
		
		System.out.println("Enter Employee Name to be updated");
		String name = sc.next();
		
		System.out.println("Enter Employee Salary to be updated");
		
		Double salary = sc.nextDouble();
		
		
		
		Employee employee = new Employee(id, name,salary);
		
		Employee emp = employeeService.updateEmployee(employee);
		
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		if(emp.getName().equalsIgnoreCase(name) && emp.getSalary()==salary) {
			
		System.out.println("Employee Record Updated successfully for Employee Id : "+emp.getEmployeeId());
		
		}else {
			
			System.err.println("Employee Record Updation Failed for Employee Id : "+emp.getEmployeeId());
		}
		
	}

	private static void delete() throws EmployeeException {
		

		System.out.println("Enter Employee Id to be Deleted");
		Long id = sc.nextLong();
				
		
		
		Long aId = employeeService.deleteEmployeeById(id);
		
		if(aId!=null) {
			
		System.out.println("Employee Record Deleted successfully for Employee Id : "+id);
		
		}else {
			
			System.err.println("Employee Record Deletion Failed for Employee Id : "+id);
		}
		
		
	}

	private static void search() throws EmployeeException {
		
		System.out.println("Enter Employee Id to be Searched");
		Long id = sc.nextLong();
				
		
		
		Employee emp = employeeService.getEmployeeById(id);
		
		if(emp!=null) {
		//if(emp.getName()!=null && emp.getSalary()!=null && emp.getEmployeeId()!=null) {
			
		System.out.println("Employee Name: "+emp.getName()+" Employee Salary: "+emp.getSalary()+" Employee Id: "+emp.getEmployeeId());
		
		}else {
			
			System.err.println("No Record found for the searched Employee Id : "+id);
		}
		
	}
	
	private static void list() throws EmployeeException {
		
		List empList =employeeService.getEmployeeList();
		
		System.out.println(empList);
		
	}

	private static void end() {
		System.out.println(
				  "\n=====================Thank you for Using our Application====================================================================================\n"
				+ "\n                         Do Visit Again!!!!\n"
				+ "\n======================================================================================================================================\n");
		//customerService.exitApp();
		System.exit(0);
	}

}
