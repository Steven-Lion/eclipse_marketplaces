package chapter8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest  {

	public static void main(String[] args) {
		Employee e1 = new Employee(11, "user1", 001);
		Employee e2 = new Employee(2, "user2", 002);
		Employee e3 = new Employee(33, "user3", 003);

		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		List list = new ArrayList<Employee>(); 
		
		list.add(e1);
		list.add(e3);
		list.add(e2);
		
		Collections.sort(list);

		System.out.println("\n implements Comparable \n");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
