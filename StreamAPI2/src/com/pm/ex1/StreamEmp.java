package com.pm.ex1;

import java.util.Arrays;
import java.util.List;

public class StreamEmp {
		public static void main(String[] args) 
		{
			List<Employee> employees = Arrays.asList(
				new Employee("Raju",1,"Bangaluru","Manager"),
				new Employee("Joel",1,"Bangaluru","Developer"),
				new Employee("John",1,"Bangaluru","Manager"),
				new Employee("Angel",1,"Goa","Developer"),
				new Employee("Sandy",1,"Channai","Manager"),
				new Employee("Nandu",1,"Bangaluru","Manager")
				);
			
			employees.stream()
				.filter(employee->employee.getCity().equals("Bangaluru"))
				.filter(employee->employee.getDesignation().equals("Developer"))
				.forEach(emp->System.out.println(emp));
		}
	


}
