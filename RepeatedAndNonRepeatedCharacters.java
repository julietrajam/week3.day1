package com.lao.stringexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 Declare a string
 Convert it to an char array
 Declare any integer varaiable to find a length of character array
 
 Decalre a Map
 Traverse therogh each element
 if the value in the character array did not match with the key value in map then put inside the map
 else 
 Declare interger variable oldval to get next element of character array
 Declare newValue 
 */
public class RepeatedAndNonRepeatedCharacters {
	
	public static void main(String[] args) {
		
		String str="sillyspiders";
	    //Converting String into an array
		char ch[]=str.toCharArray();
		int size=ch.length;
		
		Map<Character,Integer> map=new HashMap<>();
		int i=0;
		while(i<size)
		{
			if(map.containsKey(ch[i]) == false)
			{
				map.put(ch[i], 1);
			}
			else
			{
				int oldVal=map.get(ch[i]);
				int newVal=oldVal+1;
				map.put(ch[i], newVal);
			}
				++i;
		}
		
		System.out.println("Non Repeting Characters are");
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		for(Map.Entry<Character,Integer> data:hmap)
		{
			if(data.getValue() == 1)
			{
				System.out.println(data.getKey());
			}
		}
		
		System.out.println("\nRepeting Characters are");
		Set<Map.Entry<Character,Integer>> hmap1=map.entrySet();
		for(Map.Entry<Character,Integer> data1:hmap1)
		{
			if(data1.getValue() > 1)
			{
				System.out.println(data1.getKey());
			}
		}
		
		
	}

}
