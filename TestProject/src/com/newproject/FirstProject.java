package com.newproject;

public class FirstProject {

	public static void main(String[] args) {
		
		
		String s="hello world";
		String p="hell world";
		
		int i;
		System.out.println(s);
		System.out.println(s.substring(5,11));
		System.out.println(s.compareTo(p));
		System.out.println(s.concat(p));
		for(i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
