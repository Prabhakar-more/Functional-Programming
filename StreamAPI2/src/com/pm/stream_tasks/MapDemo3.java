package com.pm.stream_tasks;

import java.util.ArrayList;

record Employee(Integer id, String name, Double salary)
{
	
}


public class MapDemo3 
{

	public static void main(String[] args) 
	{
		ArrayList<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(1, "Scott", 800D));
		listOfEmp.add(new Employee(2, "Smith", 1200D));
		listOfEmp.add(new Employee(3, "Alen", 1500D));
		listOfEmp.add(new Employee(4, "Martin", 1800D));
		listOfEmp.add(new Employee(5, "John", 2000D));
		
		System.out.println("Employees record with original salary : ");
		listOfEmp.forEach(System.out::println);
		
		System.out.println("\n-------------------------------------\n");
		
		//Adding 300D salary as ana increment to all the employees
		System.out.println("Employees record with bonus amount : ");
		listOfEmp.stream().map(emp -> emp.salary() + 300).forEach(System.out::println);
		

	}

}
