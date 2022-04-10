package com.unaryoperator;

public class UnaryOperator {

	public static void main(String[] args) {
		 
		int a=19;
		int b=12;
		boolean c=true;
		boolean d=false;
		
		System.out.println(a++);//19
		System.out.println(++a);//21
		System.out.println(b++);//12
		System.out.println(++b);//14
	//	System.out.println(~a); //-22
	//	System.out.println(~b); //-15
		System.out.println(!c); //false
		System.out.println(!d); //true
		
		
		
		System.out.println(a++ + ++a);// 21-23=44
		System.out.println(b++ + ++b); // 14+16=30

		System.out.println(a-- + --a);// 23 + 21= 44
		System.out.println(b-- + --b);// 16+14=30



		
		


	}

}
