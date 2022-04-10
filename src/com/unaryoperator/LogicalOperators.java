package com.unaryoperator;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		System.out.println(a<b && a>b);//true ,false = false
		System.out.println(a<b && c>b);//true , true= true

		System.out.println(c<b || a>b); //true
		System.out.println(a<b || c<b); //true
		
		System.out.println(a<b & a>b);
		System.out.println(a<b | a>b);

	}

}
