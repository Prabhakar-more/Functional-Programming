package com.pm.stream_tasks;

import java.util.stream.Stream;

public class MapDemo2 
{

	public static void main(String[] args) 
	{
		//Find the cube of all the odd numbers
		
		Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
		
		numbers.filter(n -> n%2==1).map(num->
		num*num*num).forEach(System.out::println);

	}

}
