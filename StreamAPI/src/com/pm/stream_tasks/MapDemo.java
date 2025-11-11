package com.pm.stream_tasks;

import java.util.Arrays;
import java.util.List;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		//Add element 10 to each number of list
		List<Integer> listOfNum = Arrays.asList(1,2,3,4,5,6,7,8,9);
		listOfNum.stream().map(num -> num+10).forEach(System.out::println);

	}

}
