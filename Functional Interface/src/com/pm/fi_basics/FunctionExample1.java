package com.pm.fi_basics;

import java.util.List;
import java.util.function.Function;

public class  FunctionExample1
{
	public static void main(String[] args) 
	{
		Function<String, Integer> wordsLength = words -> words.length();
		
		String[] names = {"Java", "Functional", "hello"};

         for (String name : names) 
			 {
			 
              System.out.println(name + " => length = " + wordsLength.apply(name));
             
			 }
	}
}



/*
Function

Create a Function<String, Integer> that returns the length of a trimmed string.

Test with " hello ", "java", " functional ".
*/



//WITHOUT LAMBDA FOR UNDERSTANDING HOW LAMBDA WORKS UNDER THE HOOD
/*
Function<String, Integer> wordsLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String words) {
                return words.length();
            }
        };
		
		*/
