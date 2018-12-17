package com.jp.collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.jp.collection.entity.Employee;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//generics are used to enforce type safety in java
		
			/*List<String> list = new ArrayList<>();
			
			list.add("Beena");
			list.add("Diya");
			list.add("Ciaz");
			list.add("Amita");
			list.add(99);
			list.add(true);
			
			System.out.println(list);
			Iterator iter = list.iterator();
			System.out.println("***********Name List Before Sort");
			while(iter.hasNext())System.out.println(iter.next());
			
			Collections.sort(list);
			System.out.println("***********Name List After Sort");
			iter = list.iterator();
			while(iter.hasNext())System.out.println(iter.next());*/
			
			List<Employee> list = new ArrayList<>();
			Employee e1 = new Employee("Diya", 111.11);
			Employee e2 = new Employee("Beena", 444.44);
			Employee e3 = new Employee("Ciaz", 222.22);
			Employee e4 = new Employee("Aish", 333.33);
			list.add(e1);list.add(e2);list.add(e3);list.add(e4);
			
			Iterator iter = list.iterator();
			System.out.println("***********Employee List Before Sort");
			while(iter.hasNext())System.out.println(iter.next());
			
			Collections.sort(list);
			System.out.println("***********Employee List After Sort By empId");
			iter = list.iterator();
			while(iter.hasNext())System.out.println(iter.next());
			
			Collections.sort(list, new SortByEmpName());
			System.out.println("***********Employee List After Sort By empName");
			iter = list.iterator();
			while(iter.hasNext())System.out.println(iter.next());
			
			Collections.sort(list, new Comparator<Employee>() {
				public int compare(Employee o1, Employee o2){
					return (int) (o1.getEmpSal() - o2.getEmpSal());
				}
				
			});
			
			list.forEach(System.out::println);
			
			//lambda
			list.sort((Employee o1, Employee o2)->(int)(o1.getEmpSal() - o2.getEmpSal()));
			list.forEach((emp)->System.out.println(emp));

	}

}
