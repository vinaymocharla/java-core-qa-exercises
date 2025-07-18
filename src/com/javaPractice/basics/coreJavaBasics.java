package com.javaPractice.basics;

public class coreJavaBasics {

	public static void main(String[] args) {
		
		System.out.println("This is my Main class");
		
		coreJavaBasics obj1 = new coreJavaBasics();
		
		obj1.add(10, 877);
		System.out.println("The difference is :" + obj1.sub(30, 10));
		System.out.println("Product is :" + obj1.mul(5, 10));
		System.out.println("Division is :"+ div(8,4));
		
	}
	
	public void add(int a, int b) {
		
		int sum = a+b;
		System.out.println(sum);
		
		
	}
	public int  sub(int a, int b) {
		
		int difference = a-b;
		return difference;
		
	}
	
	private int mul(int a,int b) {
		
		int product = a*b;
		
		return product;
	}
	
	public static int div(int a,int b) {
		
		return a/b;
	}

}
